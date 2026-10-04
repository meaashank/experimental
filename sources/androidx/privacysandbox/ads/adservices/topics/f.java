package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import e.U;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@U(extension = 1000000, version = 4)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class f extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public f(@NotNull Context context) {
        G.p(context, "context");
        Object systemService = context.getSystemService((Class<Object>) d.a());
        G.o(systemService, "context.getSystemService…opicsManager::class.java)");
        super(e.a(systemService));
    }
}
