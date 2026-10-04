package androidx.compose.runtime.snapshots;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Lc.c(AnnotationRetention.BINARY)
@Lc.d(allowedTargets = {AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.PROPERTY_GETTER})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC1950a {
    String preferredPropertyName();
}
