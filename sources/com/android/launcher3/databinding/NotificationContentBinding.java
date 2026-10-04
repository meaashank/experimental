package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.d;
import com.android.launcher3.notification.NotificationFooterLayout;
import com.android.launcher3.notification.NotificationMainView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class NotificationContentBinding implements b {

    @NonNull
    public final View divider;

    @NonNull
    public final NotificationFooterLayout footer;

    @NonNull
    public final FrameLayout header;

    @NonNull
    public final LinearLayout iconRow;

    @NonNull
    public final NotificationMainView mainView;

    @NonNull
    public final TextView notificationCount;

    @NonNull
    public final TextView notificationText;

    @NonNull
    public final View overflow;

    @NonNull
    public final View popupItemIcon;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView text;

    @NonNull
    public final LinearLayout textAndBackground;

    @NonNull
    public final TextView title;

    private NotificationContentBinding(@NonNull View view, @NonNull View view2, @NonNull NotificationFooterLayout notificationFooterLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull NotificationMainView notificationMainView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view3, @NonNull View view4, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4) {
        this.rootView = view;
        this.divider = view2;
        this.footer = notificationFooterLayout;
        this.header = frameLayout;
        this.iconRow = linearLayout;
        this.mainView = notificationMainView;
        this.notificationCount = textView;
        this.notificationText = textView2;
        this.overflow = view3;
        this.popupItemIcon = view4;
        this.text = textView3;
        this.textAndBackground = linearLayout2;
        this.title = textView4;
    }

    @NonNull
    public static NotificationContentBinding bind(@NonNull View view) {
        int i10 = R.id.divider;
        View viewA = c.a(view, R.id.divider);
        if (viewA != null) {
            i10 = R.id.footer;
            NotificationFooterLayout notificationFooterLayout = (NotificationFooterLayout) c.a(view, R.id.footer);
            if (notificationFooterLayout != null) {
                i10 = R.id.header;
                FrameLayout frameLayout = (FrameLayout) c.a(view, R.id.header);
                if (frameLayout != null) {
                    i10 = R.id.icon_row;
                    LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.icon_row);
                    if (linearLayout != null) {
                        i10 = R.id.main_view;
                        NotificationMainView notificationMainView = (NotificationMainView) c.a(view, R.id.main_view);
                        if (notificationMainView != null) {
                            i10 = R.id.notification_count;
                            TextView textView = (TextView) c.a(view, R.id.notification_count);
                            if (textView != null) {
                                i10 = R.id.notification_text;
                                TextView textView2 = (TextView) c.a(view, R.id.notification_text);
                                if (textView2 != null) {
                                    i10 = R.id.overflow;
                                    View viewA2 = c.a(view, R.id.overflow);
                                    if (viewA2 != null) {
                                        i10 = R.id.popup_item_icon;
                                        View viewA3 = c.a(view, R.id.popup_item_icon);
                                        if (viewA3 != null) {
                                            i10 = R.id.text;
                                            TextView textView3 = (TextView) c.a(view, R.id.text);
                                            if (textView3 != null) {
                                                i10 = R.id.text_and_background;
                                                LinearLayout linearLayout2 = (LinearLayout) c.a(view, R.id.text_and_background);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.title;
                                                    TextView textView4 = (TextView) c.a(view, R.id.title);
                                                    if (textView4 != null) {
                                                        return new NotificationContentBinding(view, viewA, notificationFooterLayout, frameLayout, linearLayout, notificationMainView, textView, textView2, viewA2, viewA3, textView3, linearLayout2, textView4);
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
    public static NotificationContentBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException(d.f107893V1);
        }
        layoutInflater.inflate(R.layout.notification_content, viewGroup);
        return bind(viewGroup);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
