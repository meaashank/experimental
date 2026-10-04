package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableState$draggableState$1 implements androidx.compose.foundation.gestures.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f95219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState<T> f95220b;

    public static final class a implements androidx.compose.foundation.gestures.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f95221a;

        public a(AnchoredDraggableState<T> anchoredDraggableState) {
            this.f95221a = anchoredDraggableState;
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
        @Override // androidx.compose.foundation.gestures.j
        public void a(float f10) {
            AnchoredDraggableState<T> anchoredDraggableState = this.f95221a;
            C1848c.a(anchoredDraggableState.f95184o, anchoredDraggableState.D(f10), 0.0f, 2, null);
        }
    }

    public AnchoredDraggableState$draggableState$1(AnchoredDraggableState<T> anchoredDraggableState) {
        this.f95220b = anchoredDraggableState;
        this.f95219a = new a(anchoredDraggableState);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.compose.foundation.gestures.p
    @Nullable
    public Object a(@NotNull MutatePriority mutatePriority, @NotNull ed.p<? super androidx.compose.foundation.gestures.j, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) throws Throwable {
        Object objI = this.f95220b.i(mutatePriority, new AnchoredDraggableState$draggableState$1$drag$2(this, pVar, null), eVar);
        return objI == CoroutineSingletons.COROUTINE_SUSPENDED ? objI : kotlin.L0.f217464a;
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
    @Override // androidx.compose.foundation.gestures.p
    public void b(float f10) {
        this.f95220b.o(f10);
    }
}
