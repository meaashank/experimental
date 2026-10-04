package S6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface a {
    Class<?>[] banners() default {};

    Class<?>[] interstitials() default {};

    String name();

    Class<?>[] nativeFakeInterstitials() default {};

    Class<?>[] nativeIntersititials() default {};

    Class<?>[] natives() default {};

    Class<?>[] rewardedIntersititials() default {};

    Class<?>[] videoRewards() default {};
}
