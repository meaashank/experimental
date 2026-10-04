package com.google.android.exoplayer2.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class TrackSelectionView extends LinearLayout {
    private boolean allowAdaptiveSelections;
    private final ComponentListener componentListener;
    private final CheckedTextView defaultView;
    private final CheckedTextView disableView;
    private final LayoutInflater inflater;
    private boolean isDisabled;
    private DefaultTrackSelector.SelectionOverride override;
    private int rendererIndex;
    private final int selectableItemBackgroundResourceId;
    private TrackGroupArray trackGroups;
    private TrackNameProvider trackNameProvider;
    private DefaultTrackSelector trackSelector;
    private CheckedTextView[][] trackViews;

    public class ComponentListener implements View.OnClickListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.onClick(view);
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applySelection() {
        DefaultTrackSelector.ParametersBuilder parametersBuilderBuildUponParameters = this.trackSelector.buildUponParameters();
        parametersBuilderBuildUponParameters.setRendererDisabled(this.rendererIndex, this.isDisabled);
        DefaultTrackSelector.SelectionOverride selectionOverride = this.override;
        if (selectionOverride != null) {
            parametersBuilderBuildUponParameters.setSelectionOverride(this.rendererIndex, this.trackGroups, selectionOverride);
        } else {
            parametersBuilderBuildUponParameters.clearSelectionOverrides(this.rendererIndex);
        }
        this.trackSelector.setParameters(parametersBuilderBuildUponParameters);
    }

    public static Pair<AlertDialog, TrackSelectionView> getDialog(Activity activity, CharSequence charSequence, DefaultTrackSelector defaultTrackSelector, int i10) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
        TrackSelectionView trackSelectionView = (TrackSelectionView) viewInflate.findViewById(R.id.exo_track_selection_view);
        trackSelectionView.init(defaultTrackSelector, i10);
        return Pair.create(builder.setTitle(charSequence).setView(viewInflate).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.google.android.exoplayer2.ui.TrackSelectionView.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                TrackSelectionView.this.applySelection();
            }
        }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create(), trackSelectionView);
    }

    private static int[] getTracksAdding(int[] iArr, int i10) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = i10;
        return iArrCopyOf;
    }

    private static int[] getTracksRemoving(int[] iArr, int i10) {
        int[] iArr2 = new int[iArr.length - 1];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != i10) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(View view) {
        if (view == this.disableView) {
            onDisableViewClicked();
        } else if (view == this.defaultView) {
            onDefaultViewClicked();
        } else {
            onTrackViewClicked(view);
        }
        updateViewStates();
    }

    private void onDefaultViewClicked() {
        this.isDisabled = false;
        this.override = null;
    }

    private void onDisableViewClicked() {
        this.isDisabled = true;
        this.override = null;
    }

    private void onTrackViewClicked(View view) {
        this.isDisabled = false;
        Pair pair = (Pair) view.getTag();
        int iIntValue = ((Integer) pair.first).intValue();
        int iIntValue2 = ((Integer) pair.second).intValue();
        DefaultTrackSelector.SelectionOverride selectionOverride = this.override;
        if (selectionOverride == null || selectionOverride.groupIndex != iIntValue || !this.allowAdaptiveSelections) {
            this.override = new DefaultTrackSelector.SelectionOverride(iIntValue, iIntValue2);
            return;
        }
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        DefaultTrackSelector.SelectionOverride selectionOverride2 = this.override;
        int i10 = selectionOverride2.length;
        if (!zIsChecked) {
            this.override = new DefaultTrackSelector.SelectionOverride(iIntValue, getTracksAdding(selectionOverride2.tracks, iIntValue2));
        } else if (i10 != 1) {
            this.override = new DefaultTrackSelector.SelectionOverride(iIntValue, getTracksRemoving(selectionOverride2.tracks, iIntValue2));
        } else {
            this.override = null;
            this.isDisabled = true;
        }
    }

    private void updateViewStates() {
        this.disableView.setChecked(this.isDisabled);
        this.defaultView.setChecked(!this.isDisabled && this.override == null);
        int i10 = 0;
        while (i10 < this.trackViews.length) {
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.trackViews[i10];
                if (i11 < checkedTextViewArr.length) {
                    CheckedTextView checkedTextView = checkedTextViewArr[i11];
                    DefaultTrackSelector.SelectionOverride selectionOverride = this.override;
                    checkedTextView.setChecked(selectionOverride != null && selectionOverride.groupIndex == i10 && selectionOverride.containsTrack(i11));
                    i11++;
                }
            }
            i10++;
        }
    }

    private void updateViews() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.trackSelector == null) {
            this.disableView.setEnabled(false);
            this.defaultView.setEnabled(false);
            return;
        }
        this.disableView.setEnabled(true);
        this.defaultView.setEnabled(true);
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = this.trackSelector.getCurrentMappedTrackInfo();
        this.trackGroups = currentMappedTrackInfo.getTrackGroups(this.rendererIndex);
        DefaultTrackSelector.Parameters parameters = this.trackSelector.getParameters();
        this.isDisabled = parameters.getRendererDisabled(this.rendererIndex);
        this.override = parameters.getSelectionOverride(this.rendererIndex, this.trackGroups);
        this.trackViews = new CheckedTextView[this.trackGroups.length][];
        int i10 = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.trackGroups;
            if (i10 >= trackGroupArray.length) {
                updateViewStates();
                return;
            }
            TrackGroup trackGroup = trackGroupArray.get(i10);
            boolean z10 = this.allowAdaptiveSelections && this.trackGroups.get(i10).length > 1 && currentMappedTrackInfo.getAdaptiveSupport(this.rendererIndex, i10, false) != 0;
            this.trackViews[i10] = new CheckedTextView[trackGroup.length];
            for (int i11 = 0; i11 < trackGroup.length; i11++) {
                if (i11 == 0) {
                    addView(this.inflater.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.inflater.inflate(z10 ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.selectableItemBackgroundResourceId);
                checkedTextView.setText(this.trackNameProvider.getTrackName(trackGroup.getFormat(i11)));
                if (currentMappedTrackInfo.getTrackSupport(this.rendererIndex, i10, i11) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setTag(Pair.create(Integer.valueOf(i10), Integer.valueOf(i11)));
                    checkedTextView.setOnClickListener(this.componentListener);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.trackViews[i10][i11] = checkedTextView;
                addView(checkedTextView);
            }
            i10++;
        }
    }

    public void init(DefaultTrackSelector defaultTrackSelector, int i10) {
        this.trackSelector = defaultTrackSelector;
        this.rendererIndex = i10;
        updateViews();
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if ((!this.allowAdaptiveSelections) == z10) {
            this.allowAdaptiveSelections = z10;
            updateViews();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.disableView.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        this.trackNameProvider = (TrackNameProvider) Assertions.checkNotNull(trackNameProvider);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.selectableItemBackgroundResourceId = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.inflater = layoutInflaterFrom;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.trackNameProvider = new DefaultTrackNameProvider(getResources());
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.disableView = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.defaultView = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }
}
