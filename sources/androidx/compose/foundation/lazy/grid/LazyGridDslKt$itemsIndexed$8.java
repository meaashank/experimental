package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$8\n*L\n1#1,569:1\n*E\n"})
public final class LazyGridDslKt$itemsIndexed$8 extends Lambda implements ed.p<m, Integer, C1722c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.q<m, Integer, T, C1722c> f91267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T[] f91268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$8(ed.q<? super m, ? super Integer, ? super T, C1722c> qVar, T[] tArr) {
        super(2);
        this.f91267d = qVar;
        this.f91268e = tArr;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final long e(@NotNull m mVar, int i10) {
        return this.f91267d.invoke(mVar, Integer.valueOf(i10), this.f91268e[i10]).f91427a;
    }

    @Override // ed.p
    public /* synthetic */ C1722c invoke(m mVar, Integer num) {
        return new C1722c(e(mVar, num.intValue()));
    }
}
