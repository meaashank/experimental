package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4337k;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabColorSchemeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    @InterfaceC4337k
    public final Integer f86487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    @InterfaceC4337k
    public final Integer f86488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    @InterfaceC4337k
    public final Integer f86489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    @InterfaceC4337k
    public final Integer f86490d;

    public static final class Builder {

        @Nullable
        @InterfaceC4337k
        private Integer mNavigationBarColor;

        @Nullable
        @InterfaceC4337k
        private Integer mNavigationBarDividerColor;

        @Nullable
        @InterfaceC4337k
        private Integer mSecondaryToolbarColor;

        @Nullable
        @InterfaceC4337k
        private Integer mToolbarColor;

        @NonNull
        public CustomTabColorSchemeParams build() {
            return new CustomTabColorSchemeParams(this.mToolbarColor, this.mSecondaryToolbarColor, this.mNavigationBarColor, this.mNavigationBarDividerColor);
        }

        @NonNull
        public Builder setNavigationBarColor(@InterfaceC4337k int i10) {
            this.mNavigationBarColor = Integer.valueOf(i10 | (-16777216));
            return this;
        }

        @NonNull
        public Builder setNavigationBarDividerColor(@InterfaceC4337k int i10) {
            this.mNavigationBarDividerColor = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder setSecondaryToolbarColor(@InterfaceC4337k int i10) {
            this.mSecondaryToolbarColor = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder setToolbarColor(@InterfaceC4337k int i10) {
            this.mToolbarColor = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    public CustomTabColorSchemeParams(@Nullable @InterfaceC4337k Integer num, @Nullable @InterfaceC4337k Integer num2, @Nullable @InterfaceC4337k Integer num3, @Nullable @InterfaceC4337k Integer num4) {
        this.f86487a = num;
        this.f86488b = num2;
        this.f86489c = num3;
        this.f86490d = num4;
    }

    @NonNull
    public static CustomTabColorSchemeParams a(@Nullable Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new CustomTabColorSchemeParams((Integer) bundle.get(CustomTabsIntent.f86539k), (Integer) bundle.get(CustomTabsIntent.f86567y), (Integer) bundle.get(CustomTabsIntent.f86513S), (Integer) bundle.get(CustomTabsIntent.f86568y0));
    }

    @NonNull
    public Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.f86487a;
        if (num != null) {
            bundle.putInt(CustomTabsIntent.f86539k, num.intValue());
        }
        Integer num2 = this.f86488b;
        if (num2 != null) {
            bundle.putInt(CustomTabsIntent.f86567y, num2.intValue());
        }
        Integer num3 = this.f86489c;
        if (num3 != null) {
            bundle.putInt(CustomTabsIntent.f86513S, num3.intValue());
        }
        Integer num4 = this.f86490d;
        if (num4 != null) {
            bundle.putInt(CustomTabsIntent.f86568y0, num4.intValue());
        }
        return bundle;
    }

    @NonNull
    public CustomTabColorSchemeParams c(@NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
        Integer num = this.f86487a;
        if (num == null) {
            num = customTabColorSchemeParams.f86487a;
        }
        Integer num2 = this.f86488b;
        if (num2 == null) {
            num2 = customTabColorSchemeParams.f86488b;
        }
        Integer num3 = this.f86489c;
        if (num3 == null) {
            num3 = customTabColorSchemeParams.f86489c;
        }
        Integer num4 = this.f86490d;
        if (num4 == null) {
            num4 = customTabColorSchemeParams.f86490d;
        }
        return new CustomTabColorSchemeParams(num, num2, num3, num4);
    }
}
