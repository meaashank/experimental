package com.inmobi.unification.sdk;

import Lc.c;
import androidx.annotation.Keep;
import com.inmobi.media.C3665o5;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@c(AnnotationRetention.RUNTIME)
@Keep
@Retention(RetentionPolicy.RUNTIME)
public @interface InitializationStatus {

    @NotNull
    public static final C3665o5 Companion = C3665o5.f153226a;

    @NotNull
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";

    @NotNull
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";

    @NotNull
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";

    @NotNull
    public static final String SUCCESS = "Success";

    @NotNull
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";
}
