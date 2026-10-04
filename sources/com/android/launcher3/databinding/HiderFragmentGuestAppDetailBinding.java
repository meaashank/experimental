package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderFragmentGuestAppDetailBinding implements b {

    @NonNull
    public final LinearLayout detailClearData;

    @NonNull
    public final TextView detailClearDataDesc;

    @NonNull
    public final TextView detailEnabledDesc;

    @NonNull
    public final LinearLayout detailEnabledRow;

    @NonNull
    public final SwitchCompat detailEnabledSwitch;

    @NonNull
    public final TextView detailEnabledTitle;

    @NonNull
    public final ImageView detailIcon;

    @NonNull
    public final TextView detailIdentity;

    @NonNull
    public final TextView detailName;

    @NonNull
    public final TextView detailOffNote;

    @NonNull
    public final TextView detailPkg;

    @NonNull
    public final LinearLayout detailRemove;

    @NonNull
    public final TextView detailRemoveDesc;

    @NonNull
    public final TextView detailRemoveTitle;

    @NonNull
    public final TextView detailRunningDesc;

    @NonNull
    public final LinearLayout detailRunningRow;

    @NonNull
    public final TextView detailSizeTotal;

    @NonNull
    public final TextView detailStop;

    @NonNull
    public final TextView detailVersion;

    @NonNull
    private final ScrollView rootView;

    private HiderFragmentGuestAppDetailBinding(@NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull SwitchCompat switchCompat, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull LinearLayout linearLayout3, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull LinearLayout linearLayout4, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13) {
        this.rootView = scrollView;
        this.detailClearData = linearLayout;
        this.detailClearDataDesc = textView;
        this.detailEnabledDesc = textView2;
        this.detailEnabledRow = linearLayout2;
        this.detailEnabledSwitch = switchCompat;
        this.detailEnabledTitle = textView3;
        this.detailIcon = imageView;
        this.detailIdentity = textView4;
        this.detailName = textView5;
        this.detailOffNote = textView6;
        this.detailPkg = textView7;
        this.detailRemove = linearLayout3;
        this.detailRemoveDesc = textView8;
        this.detailRemoveTitle = textView9;
        this.detailRunningDesc = textView10;
        this.detailRunningRow = linearLayout4;
        this.detailSizeTotal = textView11;
        this.detailStop = textView12;
        this.detailVersion = textView13;
    }

    @NonNull
    public static HiderFragmentGuestAppDetailBinding bind(@NonNull View view) {
        int i10 = R.id.detail_clear_data;
        LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.detail_clear_data);
        if (linearLayout != null) {
            i10 = R.id.detail_clear_data_desc;
            TextView textView = (TextView) c.a(view, R.id.detail_clear_data_desc);
            if (textView != null) {
                i10 = R.id.detail_enabled_desc;
                TextView textView2 = (TextView) c.a(view, R.id.detail_enabled_desc);
                if (textView2 != null) {
                    i10 = R.id.detail_enabled_row;
                    LinearLayout linearLayout2 = (LinearLayout) c.a(view, R.id.detail_enabled_row);
                    if (linearLayout2 != null) {
                        i10 = R.id.detail_enabled_switch;
                        SwitchCompat switchCompat = (SwitchCompat) c.a(view, R.id.detail_enabled_switch);
                        if (switchCompat != null) {
                            i10 = R.id.detail_enabled_title;
                            TextView textView3 = (TextView) c.a(view, R.id.detail_enabled_title);
                            if (textView3 != null) {
                                i10 = R.id.detail_icon;
                                ImageView imageView = (ImageView) c.a(view, R.id.detail_icon);
                                if (imageView != null) {
                                    i10 = R.id.detail_identity;
                                    TextView textView4 = (TextView) c.a(view, R.id.detail_identity);
                                    if (textView4 != null) {
                                        i10 = R.id.detail_name;
                                        TextView textView5 = (TextView) c.a(view, R.id.detail_name);
                                        if (textView5 != null) {
                                            i10 = R.id.detail_off_note;
                                            TextView textView6 = (TextView) c.a(view, R.id.detail_off_note);
                                            if (textView6 != null) {
                                                i10 = R.id.detail_pkg;
                                                TextView textView7 = (TextView) c.a(view, R.id.detail_pkg);
                                                if (textView7 != null) {
                                                    i10 = R.id.detail_remove;
                                                    LinearLayout linearLayout3 = (LinearLayout) c.a(view, R.id.detail_remove);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.detail_remove_desc;
                                                        TextView textView8 = (TextView) c.a(view, R.id.detail_remove_desc);
                                                        if (textView8 != null) {
                                                            i10 = R.id.detail_remove_title;
                                                            TextView textView9 = (TextView) c.a(view, R.id.detail_remove_title);
                                                            if (textView9 != null) {
                                                                i10 = R.id.detail_running_desc;
                                                                TextView textView10 = (TextView) c.a(view, R.id.detail_running_desc);
                                                                if (textView10 != null) {
                                                                    i10 = R.id.detail_running_row;
                                                                    LinearLayout linearLayout4 = (LinearLayout) c.a(view, R.id.detail_running_row);
                                                                    if (linearLayout4 != null) {
                                                                        i10 = R.id.detail_size_total;
                                                                        TextView textView11 = (TextView) c.a(view, R.id.detail_size_total);
                                                                        if (textView11 != null) {
                                                                            i10 = R.id.detail_stop;
                                                                            TextView textView12 = (TextView) c.a(view, R.id.detail_stop);
                                                                            if (textView12 != null) {
                                                                                i10 = R.id.detail_version;
                                                                                TextView textView13 = (TextView) c.a(view, R.id.detail_version);
                                                                                if (textView13 != null) {
                                                                                    return new HiderFragmentGuestAppDetailBinding((ScrollView) view, linearLayout, textView, textView2, linearLayout2, switchCompat, textView3, imageView, textView4, textView5, textView6, textView7, linearLayout3, textView8, textView9, textView10, linearLayout4, textView11, textView12, textView13);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderFragmentGuestAppDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderFragmentGuestAppDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_fragment_guest_app_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public ScrollView getRoot() {
        return this.rootView;
    }
}
