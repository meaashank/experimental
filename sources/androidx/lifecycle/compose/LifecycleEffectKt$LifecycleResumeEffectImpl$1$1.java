package androidx.lifecycle.compose;

import androidx.compose.runtime.S;
import androidx.compose.runtime.T;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import ed.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,747:1\n64#2,5:748\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1\n*L\n708#1:748,5\n*E\n"})
public final class LifecycleEffectKt$LifecycleResumeEffectImpl$1$1 extends Lambda implements l<T, S> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f114240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f114241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l<f, e> f114242f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114243a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f114243a = iArr;
        }
    }

    @V({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1\n*L\n1#1,497:1\n709#2,3:498\n*E\n"})
    public static final class b implements S {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B f114244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2611y f114245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f114246c;

        public b(B b10, InterfaceC2611y interfaceC2611y, Ref.ObjectRef objectRef) {
            this.f114244a = b10;
            this.f114245b = interfaceC2611y;
            this.f114246c = objectRef;
        }

        @Override // androidx.compose.runtime.S
        public void dispose() {
            this.f114244a.getLifecycle().g(this.f114245b);
            e eVar = (e) this.f114246c.f217904a;
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleEffectKt$LifecycleResumeEffectImpl$1$1(B b10, f fVar, l<? super f, ? extends e> lVar) {
        super(1);
        this.f114240d = b10;
        this.f114241e = fVar;
        this.f114242f = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final void h(f fVar, Ref.ObjectRef objectRef, l lVar, B b10, Lifecycle.Event event) {
        e eVar;
        int i10 = a.f114243a[event.ordinal()];
        if (i10 == 1) {
            objectRef.f217904a = lVar.invoke(fVar);
        } else if (i10 == 2 && (eVar = (e) objectRef.f217904a) != null) {
            eVar.a();
        }
    }

    @Override // ed.l
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final S invoke(@NotNull T t10) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final f fVar = this.f114241e;
        final l<f, e> lVar = this.f114242f;
        InterfaceC2611y interfaceC2611y = new InterfaceC2611y() { // from class: androidx.lifecycle.compose.b
            @Override // androidx.lifecycle.InterfaceC2611y
            public final void onStateChanged(B b10, Lifecycle.Event event) {
                LifecycleEffectKt$LifecycleResumeEffectImpl$1$1.h(fVar, objectRef, lVar, b10, event);
            }
        };
        this.f114240d.getLifecycle().c(interfaceC2611y);
        return new b(this.f114240d, interfaceC2611y, objectRef);
    }
}
