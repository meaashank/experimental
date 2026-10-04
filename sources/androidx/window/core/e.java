package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import ed.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e<T> extends SpecificationComputer<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final T f120072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f120073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f120074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final f f120075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SpecificationComputer.VerificationMode f120076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final WindowStrictModeException f120077g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120078a;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            f120078a = iArr;
        }
    }

    public e(@NotNull T value, @NotNull String tag, @NotNull String message, @NotNull f logger, @NotNull SpecificationComputer.VerificationMode verificationMode) {
        G.p(value, "value");
        G.p(tag, "tag");
        G.p(message, "message");
        G.p(logger, "logger");
        G.p(verificationMode, "verificationMode");
        this.f120072b = value;
        this.f120073c = tag;
        this.f120074d = message;
        this.f120075e = logger;
        this.f120076f = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(b(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        G.o(stackTrace, "stackTrace");
        Object[] array = B.D9(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.f120077g = windowStrictModeException;
    }

    @Override // androidx.window.core.SpecificationComputer
    @Nullable
    public T a() throws WindowStrictModeException {
        int i10 = a.f120078a[this.f120076f.ordinal()];
        if (i10 == 1) {
            throw this.f120077g;
        }
        if (i10 == 2) {
            this.f120075e.a(this.f120073c, b(this.f120072b, this.f120074d));
            return null;
        }
        if (i10 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    public SpecificationComputer<T> c(@NotNull String message, @NotNull l<? super T, Boolean> condition) {
        G.p(message, "message");
        G.p(condition, "condition");
        return this;
    }

    @NotNull
    public final WindowStrictModeException d() {
        return this.f120077g;
    }

    @NotNull
    public final f e() {
        return this.f120075e;
    }

    @NotNull
    public final String f() {
        return this.f120074d;
    }

    @NotNull
    public final String g() {
        return this.f120073c;
    }

    @NotNull
    public final T h() {
        return this.f120072b;
    }

    @NotNull
    public final SpecificationComputer.VerificationMode i() {
        return this.f120076f;
    }
}
