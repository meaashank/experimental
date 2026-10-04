package kotlin.jvm.internal;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.InterfaceC4887e0;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@InterfaceC4887e0(version = "1.6")
@Lc.c(AnnotationRetention.BINARY)
@Lc.d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
public @interface S {
    @dd.j(name = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)
    String[] b() default {};
}
