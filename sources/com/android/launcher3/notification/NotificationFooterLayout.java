package com.android.launcher3.notification;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.launcher3.LauncherAnimUtils;
import com.android.launcher3.Utilities;
import com.android.launcher3.anim.PropertyListBuilder;
import com.android.launcher3.anim.PropertyResetListener;
import com.android.launcher3.util.Themes;
import com.app.hider.master.promax.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationFooterLayout extends FrameLayout {
    private static final int MAX_FOOTER_NOTIFICATIONS = 5;
    private static final Rect sTempRect = new Rect();
    private final int mBackgroundColor;
    private NotificationItemView mContainer;
    FrameLayout.LayoutParams mIconLayoutParams;
    private LinearLayout mIconRow;
    private final List<NotificationInfo> mNotifications;
    private View mOverflowEllipsis;
    private final List<NotificationInfo> mOverflowNotifications;
    private final boolean mRtl;

    public interface IconAnimationEndListener {
        void onIconAnimationEnd(NotificationInfo notificationInfo);
    }

    public NotificationFooterLayout(Context context) {
        this(context, null, 0);
    }

    private View addNotificationIconForInfo(NotificationInfo notificationInfo) {
        View view = new View(getContext());
        view.setBackground(notificationInfo.getIconForBackground(getContext(), this.mBackgroundColor));
        view.setOnClickListener(notificationInfo);
        view.setTag(notificationInfo);
        view.setImportantForAccessibility(2);
        this.mIconRow.addView(view, 0, this.mIconLayoutParams);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeViewFromIconRow(View view) {
        NotificationItemView notificationItemView;
        this.mIconRow.removeView(view);
        this.mNotifications.remove(view.getTag());
        updateOverflowEllipsisVisibility();
        if (this.mIconRow.getChildCount() != 0 || (notificationItemView = this.mContainer) == null) {
            return;
        }
        notificationItemView.removeFooter();
    }

    private void updateOverflowEllipsisVisibility() {
        this.mOverflowEllipsis.setVisibility(this.mOverflowNotifications.isEmpty() ? 8 : 0);
    }

    public void addNotificationInfo(NotificationInfo notificationInfo) {
        if (this.mNotifications.size() < 5) {
            this.mNotifications.add(notificationInfo);
        } else {
            this.mOverflowNotifications.add(notificationInfo);
        }
    }

    public void animateFirstNotificationTo(Rect rect, final IconAnimationEndListener iconAnimationEndListener) {
        AnimatorSet animatorSetCreateAnimatorSet = LauncherAnimUtils.createAnimatorSet();
        LinearLayout linearLayout = this.mIconRow;
        final View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
        childAt.getGlobalVisibleRect(sTempRect);
        float fHeight = rect.height() / r2.height();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = LauncherAnimUtils.ofPropertyValuesHolder(childAt, childAt, new PropertyListBuilder().scale(fHeight).translationY((((r2.height() * fHeight) - r2.height()) / 2.0f) + (rect.top - r2.top)).build());
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.notification.NotificationFooterLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                iconAnimationEndListener.onIconAnimationEnd((NotificationInfo) childAt.getTag());
                NotificationFooterLayout.this.removeViewFromIconRow(childAt);
            }
        });
        animatorSetCreateAnimatorSet.play(objectAnimatorOfPropertyValuesHolder);
        FrameLayout.LayoutParams layoutParams = this.mIconLayoutParams;
        int marginStart = layoutParams.getMarginStart() + layoutParams.width;
        if (this.mRtl) {
            marginStart = -marginStart;
        }
        if (!this.mOverflowNotifications.isEmpty()) {
            NotificationInfo notificationInfoRemove = this.mOverflowNotifications.remove(0);
            this.mNotifications.add(notificationInfoRemove);
            animatorSetCreateAnimatorSet.play(ObjectAnimator.ofFloat(addNotificationIconForInfo(notificationInfoRemove), (Property<View, Float>) FrameLayout.ALPHA, 0.0f, 1.0f));
        }
        int childCount = this.mIconRow.getChildCount() - 1;
        Float fValueOf = Float.valueOf(0.0f);
        Property property = FrameLayout.TRANSLATION_X;
        PropertyResetListener propertyResetListener = new PropertyResetListener(property, fValueOf);
        for (int i10 = 0; i10 < childCount; i10++) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mIconRow.getChildAt(i10), (Property<View, Float>) property, marginStart);
            objectAnimatorOfFloat.addListener(propertyResetListener);
            animatorSetCreateAnimatorSet.play(objectAnimatorOfFloat);
        }
        animatorSetCreateAnimatorSet.start();
    }

    public void commitNotificationInfos() {
        this.mIconRow.removeAllViews();
        for (int i10 = 0; i10 < this.mNotifications.size(); i10++) {
            addNotificationIconForInfo(this.mNotifications.get(i10));
        }
        updateOverflowEllipsisVisibility();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mOverflowEllipsis = findViewById(R.id.overflow);
        this.mIconRow = (LinearLayout) findViewById(R.id.icon_row);
    }

    public void setContainer(NotificationItemView notificationItemView) {
        this.mContainer = notificationItemView;
    }

    public void trimNotifications(List<String> list) {
        if (!isAttachedToWindow() || this.mIconRow.getChildCount() == 0) {
            return;
        }
        Iterator<NotificationInfo> it = this.mOverflowNotifications.iterator();
        while (it.hasNext()) {
            if (!list.contains(it.next().notificationKey)) {
                it.remove();
            }
        }
        for (int childCount = this.mIconRow.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mIconRow.getChildAt(childCount);
            if (!list.contains(((NotificationInfo) childAt.getTag()).notificationKey)) {
                removeViewFromIconRow(childAt);
            }
        }
    }

    public NotificationFooterLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NotificationFooterLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mNotifications = new ArrayList();
        this.mOverflowNotifications = new ArrayList();
        Resources resources = getResources();
        this.mRtl = Utilities.isRtl(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_footer_icon_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        this.mIconLayoutParams = layoutParams;
        layoutParams.gravity = 16;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_footer_icon_row_padding);
        this.mIconLayoutParams.setMarginStart((((resources.getDimensionPixelSize(R.dimen.bg_popup_item_width) - dimensionPixelSize2) - (resources.getDimensionPixelSize(R.dimen.horizontal_ellipsis_size) + resources.getDimensionPixelSize(R.dimen.horizontal_ellipsis_offset))) - (dimensionPixelSize * 5)) / 5);
        this.mBackgroundColor = Themes.getAttrColor(context, R.attr.popupColorPrimary);
    }
}
