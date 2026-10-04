package com.android.launcher3.allapps;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Process;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.dynamicanimation.animation.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.BuildConfig;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.DragSource;
import com.android.launcher3.DropTarget;
import com.android.launcher3.Insettable;
import com.android.launcher3.InsettableFrameLayout;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.Utilities;
import com.android.launcher3.allapps.AllAppsStore;
import com.android.launcher3.keyboard.FocusedItemDecorator;
import com.android.launcher3.userevent.nano.LauncherLogProto;
import com.android.launcher3.util.ItemInfoMatcher;
import com.android.launcher3.util.Themes;
import com.android.launcher3.views.BottomUserEducationView;
import com.android.launcher3.views.RecyclerViewFastScroller;
import com.android.launcher3.views.SpringRelativeLayout;
import com.app.hider.master.promax.R;
import com.prism.commons.utils.g0;
import com.prism.commons.utils.h0;

/* JADX INFO: loaded from: classes2.dex */
public class AllAppsContainerView extends SpringRelativeLayout implements DragSource, Insettable, DeviceProfile.OnDeviceProfileChangeListener {
    private static final float FLING_ANIMATION_THRESHOLD = 0.55f;
    private static final float FLING_VELOCITY_MULTIPLIER = 135.0f;
    private View extensionView;
    private final AdapterHolder[] mAH;
    private final AllAppsStore mAllAppsStore;
    private final Point mFastScrollerOffset;
    private FloatingHeaderView mHeader;
    private final Launcher mLauncher;
    private int mNavBarScrimHeight;
    private final Paint mNavBarScrimPaint;
    private final ItemInfoMatcher mPersonalMatcher;
    private View mSearchContainer;
    private boolean mSearchModeWhileUsingTabs;
    private SpannableStringBuilder mSearchQueryBuilder;
    private SearchUiManager mSearchUiManager;
    private RecyclerViewFastScroller mTouchHandler;
    private boolean mUsingTabs;
    private AllAppsPagedView mViewPager;
    private final ItemInfoMatcher mWorkMatcher;

    public class AdapterHolder {
        public static final int MAIN = 0;
        public static final int WORK = 1;
        public final AllAppsGridAdapter adapter;
        final AlphabeticalAppsList appsList;
        final LinearLayoutManager layoutManager;
        final Rect padding = new Rect();
        AllAppsRecyclerView recyclerView;
        boolean verticalFadingEdge;

        public AdapterHolder(boolean z10) {
            AlphabeticalAppsList alphabeticalAppsList = new AlphabeticalAppsList(AllAppsContainerView.this.mLauncher, AllAppsContainerView.this.mAllAppsStore, z10);
            this.appsList = alphabeticalAppsList;
            AllAppsGridAdapter allAppsGridAdapter = new AllAppsGridAdapter(AllAppsContainerView.this.mLauncher, alphabeticalAppsList);
            this.adapter = allAppsGridAdapter;
            alphabeticalAppsList.setAdapter(allAppsGridAdapter);
            this.layoutManager = allAppsGridAdapter.getLayoutManager();
        }

        public void applyPadding() {
            AllAppsRecyclerView allAppsRecyclerView = this.recyclerView;
            if (allAppsRecyclerView != null) {
                Rect rect = this.padding;
                allAppsRecyclerView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        public void applyVerticalFadingEdgeEnabled(boolean z10) {
            this.verticalFadingEdge = z10;
            boolean z11 = false;
            AllAppsRecyclerView allAppsRecyclerView = AllAppsContainerView.this.mAH[0].recyclerView;
            if (!AllAppsContainerView.this.mUsingTabs && this.verticalFadingEdge) {
                z11 = true;
            }
            allAppsRecyclerView.setVerticalFadingEdgeEnabled(z11);
        }

        public void setup(@NonNull View view, @Nullable ItemInfoMatcher itemInfoMatcher) {
            this.appsList.updateItemFilter(itemInfoMatcher);
            AllAppsRecyclerView allAppsRecyclerView = (AllAppsRecyclerView) view;
            this.recyclerView = allAppsRecyclerView;
            allAppsRecyclerView.setEdgeEffectFactory(AllAppsContainerView.this.createEdgeEffectFactory());
            this.recyclerView.setApps(this.appsList, AllAppsContainerView.this.mUsingTabs);
            this.recyclerView.setLayoutManager(this.layoutManager);
            this.recyclerView.setAdapter(this.adapter);
            this.recyclerView.setHasFixedSize(true);
            this.recyclerView.setItemAnimator(null);
            FocusedItemDecorator focusedItemDecorator = new FocusedItemDecorator(this.recyclerView);
            this.recyclerView.addItemDecoration(focusedItemDecorator);
            this.adapter.setIconFocusListener(focusedItemDecorator.getFocusListener());
            applyVerticalFadingEdgeEnabled(this.verticalFadingEdge);
            applyPadding();
        }
    }

    public AllAppsContainerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void h(final View view) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(view.getContext()).setMessage(R.string.ext_all_apps_jump_to_gp_apphider).setPositiveButton(R.string.text_confirm, new DialogInterface.OnClickListener() { // from class: com.android.launcher3.allapps.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                g0.e(view.getContext(), BuildConfig.NO_QUERY_ALL_PACKAGES_GO_TO, true);
            }
        }).setNegativeButton(R.string.text_cancel, new e()).create();
        h0.a(view.getContext(), alertDialogCreate);
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFinishInflate$0(View view, boolean z10) {
        if (!z10 || getActiveRecyclerView() == null) {
            return;
        }
        getActiveRecyclerView().requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTabChanged$4(View view) {
        this.mViewPager.snapToPage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTabChanged$5(View view) {
        this.mViewPager.snapToPage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAppsUpdated() {
    }

    private void rebindAdapters(boolean z10) {
        rebindAdapters(z10, false);
    }

    private void replaceRVContainer(boolean z10) {
        int i10 = 0;
        while (true) {
            AdapterHolder[] adapterHolderArr = this.mAH;
            if (i10 >= adapterHolderArr.length) {
                break;
            }
            AllAppsRecyclerView allAppsRecyclerView = adapterHolderArr[i10].recyclerView;
            if (allAppsRecyclerView != null) {
                allAppsRecyclerView.setLayoutManager(null);
            }
            i10++;
        }
        View recyclerViewContainer = getRecyclerViewContainer();
        int iIndexOfChild = indexOfChild(recyclerViewContainer);
        removeView(recyclerViewContainer);
        View viewInflate = LayoutInflater.from(getContext()).inflate(z10 ? R.layout.all_apps_tabs : R.layout.all_apps_rv_layout, (ViewGroup) this, false);
        addView(viewInflate, iIndexOfChild);
        if (!z10) {
            this.mViewPager = null;
            return;
        }
        AllAppsPagedView allAppsPagedView = (AllAppsPagedView) viewInflate;
        this.mViewPager = allAppsPagedView;
        allAppsPagedView.initParentViews(this);
        this.mViewPager.getPageIndicator().setContainerView(this);
    }

    public void addElevationController(RecyclerView.r rVar) {
        if (this.mUsingTabs) {
            return;
        }
        this.mAH[0].recyclerView.addOnScrollListener(rVar);
    }

    public void addSpringFromFlingUpdateListener(ValueAnimator valueAnimator, final float f10) {
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.allapps.AllAppsContainerView.1
            boolean shouldSpring = true;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                if (!this.shouldSpring || valueAnimator2.getAnimatedFraction() < 0.55f) {
                    return;
                }
                final int id2 = AllAppsContainerView.this.getSearchView().getId();
                AllAppsContainerView.this.addSpringView(id2);
                AllAppsContainerView.this.finishWithShiftAndVelocity(1.0f, f10 * 135.0f, new b.q() { // from class: com.android.launcher3.allapps.AllAppsContainerView.1.1
                    @Override // androidx.dynamicanimation.animation.b.q
                    public void onAnimationEnd(androidx.dynamicanimation.animation.b bVar, boolean z10, float f11, float f12) {
                        AllAppsContainerView.this.removeSpringView(id2);
                    }
                });
                this.shouldSpring = false;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.mNavBarScrimHeight > 0) {
            canvas.drawRect(0.0f, getHeight() - this.mNavBarScrimHeight, getWidth(), getHeight(), this.mNavBarScrimPaint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        this.mSearchUiManager.preDispatchKeyEvent(keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.android.launcher3.logging.UserEventDispatcher.LogContainerProvider
    public void fillInLogContainerData(View view, ItemInfo itemInfo, LauncherLogProto.Target target, LauncherLogProto.Target target2) {
    }

    public AllAppsRecyclerView getActiveRecyclerView() {
        return (!this.mUsingTabs || this.mViewPager.getNextPage() == 0) ? this.mAH[0].recyclerView : this.mAH[1].recyclerView;
    }

    public AlphabeticalAppsList getApps() {
        return this.mAH[0].appsList;
    }

    public AllAppsStore getAppsStore() {
        return this.mAllAppsStore;
    }

    public View getContentView() {
        AllAppsPagedView allAppsPagedView = this.mViewPager;
        return allAppsPagedView == null ? getActiveRecyclerView() : allAppsPagedView;
    }

    public String getDescription() {
        return getContext().getString(this.mUsingTabs ? this.mViewPager.getNextPage() == 0 ? R.string.all_apps_button_personal_label : R.string.all_apps_button_work_label : R.string.all_apps_button_label);
    }

    public View getExtensionView() {
        return this.extensionView;
    }

    public FloatingHeaderView getFloatingHeaderView() {
        return this.mHeader;
    }

    public View getRecyclerViewContainer() {
        AllAppsPagedView allAppsPagedView = this.mViewPager;
        return allAppsPagedView != null ? allAppsPagedView : findViewById(R.id.apps_list_view);
    }

    public RecyclerViewFastScroller getScrollBar() {
        AllAppsRecyclerView activeRecyclerView = getActiveRecyclerView();
        if (activeRecyclerView == null) {
            return null;
        }
        return activeRecyclerView.getScrollbar();
    }

    public SearchUiManager getSearchUiManager() {
        return this.mSearchUiManager;
    }

    public View getSearchView() {
        return this.mSearchContainer;
    }

    public boolean isHeaderVisible() {
        FloatingHeaderView floatingHeaderView = this.mHeader;
        return floatingHeaderView != null && floatingHeaderView.getVisibility() == 0;
    }

    public void onClearSearchResult() {
        if (this.mSearchModeWhileUsingTabs) {
            rebindAdapters(true);
            this.mSearchModeWhileUsingTabs = false;
        }
    }

    @Override // com.android.launcher3.DeviceProfile.OnDeviceProfileChangeListener
    public void onDeviceProfileChanged(DeviceProfile deviceProfile) {
        for (AdapterHolder adapterHolder : this.mAH) {
            AllAppsRecyclerView allAppsRecyclerView = adapterHolder.recyclerView;
            if (allAppsRecyclerView != null) {
                allAppsRecyclerView.swapAdapter(allAppsRecyclerView.getAdapter(), true);
                adapterHolder.recyclerView.getRecycledViewPool().b();
            }
        }
    }

    @Override // com.android.launcher3.DragSource
    public void onDropCompleted(View view, DropTarget.DragObject dragObject, boolean z10) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.android.launcher3.allapps.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f136890a.lambda$onFinishInflate$0(view, z10);
            }
        });
        this.mHeader = (FloatingHeaderView) findViewById(R.id.all_apps_header);
        rebindAdapters(this.mUsingTabs, true);
        View viewFindViewById = findViewById(R.id.search_container_all_apps);
        this.mSearchContainer = viewFindViewById;
        SearchUiManager searchUiManager = (SearchUiManager) viewFindViewById;
        this.mSearchUiManager = searchUiManager;
        searchUiManager.initialize(this);
        View viewFindViewById2 = findViewById(R.id.all_apps_extension);
        this.extensionView = viewFindViewById2;
        if (viewFindViewById2 instanceof AllAppsExtensionViewController) {
            ((AllAppsExtensionViewController) viewFindViewById2).init(this.mLauncher);
        }
        if (BuildConfig.NO_QUERY_ALL_PACKAGES_GO_TO != null) {
            View viewFindViewById3 = findViewById(R.id.all_apps_footer);
            viewFindViewById3.setVisibility(0);
            viewFindViewById3.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AllAppsRecyclerView activeRecyclerView;
        if (motionEvent.getAction() == 0 && (activeRecyclerView = getActiveRecyclerView()) != null && activeRecyclerView.getScrollbar().isHitInParent(motionEvent.getX(), motionEvent.getY(), this.mFastScrollerOffset)) {
            this.mTouchHandler = activeRecyclerView.getScrollbar();
        }
        RecyclerViewFastScroller recyclerViewFastScroller = this.mTouchHandler;
        if (recyclerViewFastScroller != null) {
            return recyclerViewFastScroller.handleTouchEvent(motionEvent, this.mFastScrollerOffset);
        }
        return false;
    }

    public void onScrollUpEnd() {
        if (this.mUsingTabs) {
            ((PersonalWorkSlidingTabStrip) findViewById(R.id.tabs)).highlightWorkTabIfNecessary();
        }
    }

    public void onSearchResultsChanged() {
        int i10 = 0;
        while (true) {
            AdapterHolder[] adapterHolderArr = this.mAH;
            if (i10 >= adapterHolderArr.length) {
                return;
            }
            AllAppsRecyclerView allAppsRecyclerView = adapterHolderArr[i10].recyclerView;
            if (allAppsRecyclerView != null) {
                allAppsRecyclerView.onSearchResultsChanged();
            }
            i10++;
        }
    }

    public void onTabChanged(int i10) {
        this.mHeader.setMainActive(i10 == 0);
        reset(true);
        AllAppsRecyclerView allAppsRecyclerView = this.mAH[i10].recyclerView;
        if (allAppsRecyclerView != null) {
            allAppsRecyclerView.bindFastScrollbar();
            findViewById(R.id.tab_personal).setOnClickListener(new View.OnClickListener() { // from class: com.android.launcher3.allapps.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f136892a.lambda$onTabChanged$4(view);
                }
            });
            findViewById(R.id.tab_work).setOnClickListener(new View.OnClickListener() { // from class: com.android.launcher3.allapps.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f136893a.lambda$onTabChanged$5(view);
                }
            });
        }
        if (i10 == 1) {
            BottomUserEducationView.showIfNeeded(this.mLauncher);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RecyclerViewFastScroller recyclerViewFastScroller = this.mTouchHandler;
        if (recyclerViewFastScroller == null) {
            return false;
        }
        recyclerViewFastScroller.handleTouchEvent(motionEvent, this.mFastScrollerOffset);
        return true;
    }

    public void reset(boolean z10) {
        int i10 = 0;
        while (true) {
            AdapterHolder[] adapterHolderArr = this.mAH;
            if (i10 >= adapterHolderArr.length) {
                break;
            }
            AllAppsRecyclerView allAppsRecyclerView = adapterHolderArr[i10].recyclerView;
            if (allAppsRecyclerView != null) {
                allAppsRecyclerView.scrollToTop();
            }
            i10++;
        }
        if (isHeaderVisible()) {
            this.mHeader.reset(z10);
        }
        this.mSearchUiManager.resetSearch();
    }

    @Override // com.android.launcher3.views.SpringRelativeLayout
    public void setDampedScrollShift(float f10) {
        float height = getSearchView().getHeight() / 2.0f;
        super.setDampedScrollShift(Utilities.boundToRange(f10, -height, height));
    }

    @Override // com.android.launcher3.Insettable
    public void setInsets(Rect rect) {
        DeviceProfile deviceProfile = this.mLauncher.getDeviceProfile();
        int i10 = deviceProfile.desiredWorkspaceLeftRightMarginPx + deviceProfile.cellLayoutPaddingLeftRightPx;
        int i11 = 0;
        while (true) {
            AdapterHolder[] adapterHolderArr = this.mAH;
            if (i11 >= adapterHolderArr.length) {
                break;
            }
            AdapterHolder adapterHolder = adapterHolderArr[i11];
            Rect rect2 = adapterHolder.padding;
            rect2.bottom = rect.bottom;
            rect2.right = i10;
            rect2.left = i10;
            adapterHolder.applyPadding();
            i11++;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        if (deviceProfile.isVerticalBarLayout()) {
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.rightMargin = rect.right;
            Rect rect3 = deviceProfile.workspacePadding;
            setPadding(rect3.left, 0, rect3.right, 0);
        } else {
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.leftMargin = 0;
            setPadding(0, 0, 0, 0);
        }
        setLayoutParams(marginLayoutParams);
        this.mNavBarScrimHeight = rect.bottom;
        InsettableFrameLayout.dispatchInsets(this, rect);
    }

    public void setLastSearchQuery(String str) {
        int i10 = 0;
        while (true) {
            AdapterHolder[] adapterHolderArr = this.mAH;
            if (i10 >= adapterHolderArr.length) {
                break;
            }
            adapterHolderArr[i10].adapter.setLastSearchQuery(str);
            i10++;
        }
        if (this.mUsingTabs) {
            this.mSearchModeWhileUsingTabs = true;
            rebindAdapters(false);
        }
    }

    public void setRecyclerViewVerticalFadingEdgeEnabled(boolean z10) {
        int i10 = 0;
        while (true) {
            AdapterHolder[] adapterHolderArr = this.mAH;
            if (i10 >= adapterHolderArr.length) {
                return;
            }
            adapterHolderArr[i10].applyVerticalFadingEdgeEnabled(z10);
            i10++;
        }
    }

    public void setupHeader() {
        int i10 = 0;
        this.mHeader.setVisibility(0);
        FloatingHeaderView floatingHeaderView = this.mHeader;
        AdapterHolder[] adapterHolderArr = this.mAH;
        floatingHeaderView.setup(adapterHolderArr, adapterHolderArr[1].recyclerView == null);
        int maxTranslation = this.mHeader.getMaxTranslation();
        while (true) {
            AdapterHolder[] adapterHolderArr2 = this.mAH;
            if (i10 >= adapterHolderArr2.length) {
                return;
            }
            AdapterHolder adapterHolder = adapterHolderArr2[i10];
            adapterHolder.padding.top = maxTranslation;
            adapterHolder.applyPadding();
            i10++;
        }
    }

    public boolean shouldContainerScroll(MotionEvent motionEvent) {
        AllAppsRecyclerView activeRecyclerView;
        KeyEvent.Callback callback = this.extensionView;
        if (callback instanceof AllAppsExtensionViewController) {
            return ((AllAppsExtensionViewController) callback).shouldContainerScroll(this.mLauncher, motionEvent);
        }
        if (this.mLauncher.getDragLayer().isEventOverView(this.mSearchContainer, motionEvent) || (activeRecyclerView = getActiveRecyclerView()) == null) {
            return true;
        }
        if (activeRecyclerView.getScrollbar().getThumbOffsetY() < 0 || !this.mLauncher.getDragLayer().isEventOverView(activeRecyclerView.getScrollbar(), motionEvent)) {
            return activeRecyclerView.shouldContainerScroll(motionEvent, this.mLauncher.getDragLayer());
        }
        return false;
    }

    public AllAppsContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void rebindAdapters(boolean z10, boolean z11) {
        if (z10 != this.mUsingTabs || z11) {
            replaceRVContainer(z10);
            this.mUsingTabs = z10;
            this.mAllAppsStore.unregisterIconContainer(this.mAH[0].recyclerView);
            this.mAllAppsStore.unregisterIconContainer(this.mAH[1].recyclerView);
            if (this.mUsingTabs) {
                this.mAH[0].setup(this.mViewPager.getChildAt(0), this.mPersonalMatcher);
                this.mAH[1].setup(this.mViewPager.getChildAt(1), this.mWorkMatcher);
                onTabChanged(this.mViewPager.getNextPage());
            } else {
                this.mAH[0].setup(findViewById(R.id.apps_list_view), null);
                this.mAH[1].recyclerView = null;
            }
            setupHeader();
            this.mAllAppsStore.registerIconContainer(this.mAH[0].recyclerView);
            this.mAllAppsStore.registerIconContainer(this.mAH[1].recyclerView);
        }
    }

    public AllAppsContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ItemInfoMatcher itemInfoMatcherOfUser = ItemInfoMatcher.ofUser(Process.myUserHandle());
        this.mPersonalMatcher = itemInfoMatcherOfUser;
        this.mWorkMatcher = ItemInfoMatcher.not(itemInfoMatcherOfUser);
        AllAppsStore allAppsStore = new AllAppsStore();
        this.mAllAppsStore = allAppsStore;
        this.mNavBarScrimHeight = 0;
        this.mSearchQueryBuilder = null;
        this.mSearchModeWhileUsingTabs = false;
        this.mFastScrollerOffset = new Point();
        Launcher launcher = Launcher.getLauncher(context);
        this.mLauncher = launcher;
        launcher.addOnDeviceProfileChangeListener(this);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.mSearchQueryBuilder = spannableStringBuilder;
        Selection.setSelection(spannableStringBuilder, 0);
        this.mAH = new AdapterHolder[]{new AdapterHolder(false), new AdapterHolder(true)};
        Paint paint = new Paint();
        this.mNavBarScrimPaint = paint;
        paint.setColor(Themes.getAttrColor(context, R.attr.allAppsNavBarScrimColor));
        allAppsStore.addUpdateListener(new AllAppsStore.OnUpdateListener() { // from class: com.android.launcher3.allapps.a
            @Override // com.android.launcher3.allapps.AllAppsStore.OnUpdateListener
            public final void onAppsUpdated() {
                this.f136889a.onAppsUpdated();
            }
        });
        addSpringView(R.id.all_apps_header);
        addSpringView(R.id.apps_list_view);
        addSpringView(R.id.all_apps_tabs_view_pager);
    }
}
