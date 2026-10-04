package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import ed.l;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g<T> extends SpecificationComputer<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final T f120079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f120080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SpecificationComputer.VerificationMode f120081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final f f120082e;

    public g(@NotNull T value, @NotNull String tag, @NotNull SpecificationComputer.VerificationMode verificationMode, @NotNull f logger) {
        G.p(value, "value");
        G.p(tag, "tag");
        G.p(verificationMode, "verificationMode");
        G.p(logger, "logger");
        this.f120079b = value;
        this.f120080c = tag;
        this.f120081d = verificationMode;
        this.f120082e = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    public T a() {
        return this.f120079b;
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    public SpecificationComputer<T> c(@NotNull String message, @NotNull l<? super T, Boolean> condition) {
        G.p(message, "message");
        G.p(condition, "condition");
        return condition.invoke(this.f120079b).booleanValue() ? this : new e(this.f120079b, this.f120080c, message, this.f120082e, this.f120081d);
    }

    @NotNull
    public final f d() {
        return this.f120082e;
    }

    @NotNull
    public final String e() {
        return this.f120080c;
    }

    @NotNull
    public final T f() {
        return this.f120079b;
    }

    @NotNull
    public final SpecificationComputer.VerificationMode g() {
        return this.f120081d;
    }
}
