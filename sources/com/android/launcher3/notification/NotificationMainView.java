package com.android.launcher3.notification;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.anim.AnimationSuccessListener;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.touch.OverScroll;
import com.android.launcher3.touch.SwipeDetector;
import com.android.launcher3.util.Themes;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
public class NotificationMainView extends FrameLayout implements SwipeDetector.Listener {
    private static FloatProperty CONTENT_TRANSLATION = new FloatProperty("contentTranslation") { // from class: com.android.launcher3.notification.NotificationMainView.1
        @Override // android.util.Property
        public Float get(NotificationMainView notificationMainView) {
            return Float.valueOf(notificationMainView.mTextAndBackground.getTranslationX());
        }

        public void setValue(NotificationMainView notificationMainView, float f10) {
            notificationMainView.setContentTranslation(f10);
        }
    };
    public static final ItemInfo NOTIFICATION_ITEM_INFO = new ItemInfo();
    private int mBackgroundColor;
    private final ObjectAnimator mContentTranslateAnimator;
    private View mIconView;
    private NotificationInfo mNotificationInfo;
    private SwipeDetector mSwipeDetector;
    private ViewGroup mTextAndBackground;
    private TextView mTextView;
    private TextView mTitleView;

    public NotificationMainView(Context context) {
        this(context, null, 0);
    }

    public void applyNotificationInfo(NotificationInfo notificationInfo, boolean z10) {
        this.mNotificationInfo = notificationInfo;
        CharSequence charSequence = notificationInfo.title;
        CharSequence charSequence2 = notificationInfo.text;
        if (TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(charSequence2)) {
            this.mTitleView.setMaxLines(2);
            this.mTitleView.setText(TextUtils.isEmpty(charSequence) ? charSequence2.toString() : charSequence.toString());
            this.mTextView.setVisibility(8);
        } else {
            this.mTitleView.setText(charSequence.toString());
            this.mTextView.setText(charSequence2.toString());
        }
        this.mIconView.setBackground(this.mNotificationInfo.getIconForBackground(getContext(), this.mBackgroundColor));
        NotificationInfo notificationInfo2 = this.mNotificationInfo;
        if (notificationInfo2.intent != null) {
            setOnClickListener(notificationInfo2);
        }
        setContentTranslation(0.0f);
        setTag(NOTIFICATION_ITEM_INFO);
        if (z10) {
            ObjectAnimator.ofFloat(this.mTextAndBackground, (Property<ViewGroup, Float>) FrameLayout.ALPHA, 0.0f, 1.0f).setDuration(150L).start();
        }
    }

    public boolean canChildBeDismissed() {
        NotificationInfo notificationInfo = this.mNotificationInfo;
        return notificationInfo != null && notificationInfo.dismissable;
    }

    public NotificationInfo getNotificationInfo() {
        return this.mNotificationInfo;
    }

    public void onChildDismissed() {
        Launcher launcher = Launcher.getLauncher(getContext());
        launcher.getPopupDataProvider().cancelNotification(this.mNotificationInfo.notificationKey);
        launcher.getUserEventDispatcher().logActionOnItem(3, 4, 8);
    }

    @Override // com.android.launcher3.touch.SwipeDetector.Listener
    public boolean onDrag(float f10, float f11) {
        if (!canChildBeDismissed()) {
            f10 = OverScroll.dampedScroll(f10, getWidth());
        }
        setContentTranslation(f10);
        this.mContentTranslateAnimator.cancel();
        return true;
    }

    @Override // com.android.launcher3.touch.SwipeDetector.Listener
    public void onDragEnd(float f10, boolean z10) {
        final boolean z11;
        float translationX = this.mTextAndBackground.getTranslationX();
        float width = 0.0f;
        if (canChildBeDismissed()) {
            if (z10) {
                width = f10 < 0.0f ? -getWidth() : getWidth();
            } else {
                if (Math.abs(translationX) > getWidth() / 2) {
                    width = translationX < 0.0f ? -getWidth() : getWidth();
                }
                z11 = false;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        long jCalculateDuration = SwipeDetector.calculateDuration(f10, (width - translationX) / getWidth());
        this.mContentTranslateAnimator.removeAllListeners();
        this.mContentTranslateAnimator.setDuration(jCalculateDuration).setInterpolator(Interpolators.scrollInterpolatorForVelocity(f10));
        this.mContentTranslateAnimator.setFloatValues(translationX, width);
        this.mContentTranslateAnimator.addListener(new AnimationSuccessListener() { // from class: com.android.launcher3.notification.NotificationMainView.2
            @Override // com.android.launcher3.anim.AnimationSuccessListener
            public void onAnimationSuccess(Animator animator) {
                NotificationMainView.this.mSwipeDetector.finishedScrolling();
                if (z11) {
                    NotificationMainView.this.onChildDismissed();
                }
            }
        });
        this.mContentTranslateAnimator.start();
    }

    @Override // com.android.launcher3.touch.SwipeDetector.Listener
    public void onDragStart(boolean z10) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.text_and_background);
        this.mTextAndBackground = viewGroup;
        ColorDrawable colorDrawable = (ColorDrawable) viewGroup.getBackground();
        this.mBackgroundColor = colorDrawable.getColor();
        this.mTextAndBackground.setBackground(new RippleDrawable(ColorStateList.valueOf(Themes.getAttrColor(getContext(), android.R.attr.colorControlHighlight)), colorDrawable, null));
        this.mTitleView = (TextView) this.mTextAndBackground.findViewById(R.id.title);
        this.mTextView = (TextView) this.mTextAndBackground.findViewById(R.id.text);
        this.mIconView = findViewById(R.id.popup_item_icon);
    }

    public void setContentTranslation(float f10) {
        this.mTextAndBackground.setTranslationX(f10);
        this.mIconView.setTranslationX(f10);
    }

    public void setContentVisibility(int i10) {
        this.mTextAndBackground.setVisibility(i10);
        this.mIconView.setVisibility(i10);
    }

    public void setSwipeDetector(SwipeDetector swipeDetector) {
        this.mSwipeDetector = swipeDetector;
    }

    public NotificationMainView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NotificationMainView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mContentTranslateAnimator = ObjectAnimator.ofFloat(this, CONTENT_TRANSLATION, 0.0f);
    }
}
