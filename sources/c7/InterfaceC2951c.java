package c7;

import com.prism.gaia.genum.AutoLogSetting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: c7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC2951c {
    AutoLogSetting value() default AutoLogSetting.OFF;
}
