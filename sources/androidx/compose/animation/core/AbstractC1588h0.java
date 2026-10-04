package androidx.compose.animation.core;

import androidx.collection.C1562v0;
import androidx.compose.animation.core.AbstractC1584f0;
import e.InterfaceC4348w;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpecBaseConfig\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1095:1\n26#2:1096\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpecBaseConfig\n*L\n527#1:1096\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class AbstractC1588h0<T, E extends AbstractC1584f0<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f88125d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C1562v0<E> f88128c;

    public /* synthetic */ AbstractC1588h0(C4969v c4969v) {
        this();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    public E a(T t10, @e.D(from = 0) int i10) {
        E e10 = (E) c(t10);
        this.f88128c.j0(i10, e10);
        return e10;
    }

    @NotNull
    public E b(T t10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
        return (E) a(t10, Math.round(this.f88126a * f10));
    }

    @NotNull
    public abstract E c(T t10);

    @e.D(from = 0)
    public final int d() {
        return this.f88127b;
    }

    @e.D(from = 0)
    public final int e() {
        return this.f88126a;
    }

    @NotNull
    public final C1562v0<E> f() {
        return this.f88128c;
    }

    public final void g(@e.D(from = 0) int i10) {
        this.f88127b = i10;
    }

    public final void h(@e.D(from = 0) int i10) {
        this.f88126a = i10;
    }

    @NotNull
    public final E i(@NotNull E e10, @NotNull G g10) {
        e10.f88109b = g10;
        return e10;
    }

    public AbstractC1588h0() {
        this.f88126a = 300;
        this.f88128c = androidx.collection.N.h();
    }
}
