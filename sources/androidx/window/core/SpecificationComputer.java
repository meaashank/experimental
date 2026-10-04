package androidx.window.core;

import ed.l;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SpecificationComputer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f120052a = new a();

    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    public static final class a {
        public a() {
        }

        public static SpecificationComputer b(a aVar, Object obj, String str, VerificationMode verificationMode, f fVar, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                c.f120070a.getClass();
                verificationMode = c.f120071b;
            }
            if ((i10 & 4) != 0) {
                fVar = androidx.window.core.a.f120065a;
            }
            return aVar.a(obj, str, verificationMode, fVar);
        }

        @NotNull
        public final <T> SpecificationComputer<T> a(@NotNull T t10, @NotNull String tag, @NotNull VerificationMode verificationMode, @NotNull f logger) {
            G.p(t10, "<this>");
            G.p(tag, "tag");
            G.p(verificationMode, "verificationMode");
            G.p(logger, "logger");
            return new g(t10, tag, verificationMode, logger);
        }

        public a(C4969v c4969v) {
        }
    }

    @Nullable
    public abstract T a();

    @NotNull
    public final String b(@NotNull Object value, @NotNull String message) {
        G.p(value, "value");
        G.p(message, "message");
        return message + " value: " + value;
    }

    @NotNull
    public abstract SpecificationComputer<T> c(@NotNull String str, @NotNull l<? super T, Boolean> lVar);
}
