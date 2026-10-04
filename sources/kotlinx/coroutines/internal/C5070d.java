package kotlinx.coroutines.internal;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@IgnoreJRERequirement
public final class C5070d extends AbstractC5078l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5070d f220332a = new C5070d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f220333b = new a();

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.d$a */
    public static final class a extends ClassValue<ed.l<? super Throwable, ? extends Throwable>> {
        @Override // java.lang.ClassValue
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ed.l<Throwable, Throwable> computeValue(@Nullable Class<?> cls) {
            kotlin.jvm.internal.G.n(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return ExceptionsConstructorKt.b(cls);
        }
    }

    @Override // kotlinx.coroutines.internal.AbstractC5078l
    @NotNull
    public ed.l<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls) {
        return (ed.l) f220333b.get(cls);
    }
}
