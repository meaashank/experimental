package androidx.activity.compose;

import androidx.activity.result.j;
import androidx.compose.runtime.S;
import androidx.compose.runtime.T;
import androidx.compose.runtime.X1;
import d.AbstractC4282a;
import ed.l;
import kotlin.L0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n62#2,5:162\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n108#1:162,5\n*E\n"})
public final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1 extends Lambda implements l<T, S> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b<I> f84917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f84918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f84919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC4282a<I, O> f84920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X1<l<O, L0>> f84921h;

    @V({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n1#1,483:1\n109#2,2:484\n*E\n"})
    public static final class a implements S {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f84922a;

        public a(b bVar) {
            this.f84922a = bVar;
        }

        @Override // androidx.compose.runtime.S
        public void dispose() {
            this.f84922a.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1(b<I> bVar, j jVar, String str, AbstractC4282a<I, O> abstractC4282a, X1<? extends l<? super O, L0>> x12) {
        super(1);
        this.f84917d = bVar;
        this.f84918e = jVar;
        this.f84919f = str;
        this.f84920g = abstractC4282a;
        this.f84921h = x12;
    }

    public static final void h(X1 x12, Object obj) {
        ((l) x12.getValue()).invoke(obj);
    }

    @Override // ed.l
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final S invoke(@NotNull T t10) {
        b<I> bVar = this.f84917d;
        j jVar = this.f84918e;
        String str = this.f84919f;
        Object obj = this.f84920g;
        final X1<l<O, L0>> x12 = this.f84921h;
        bVar.f84994a = jVar.j(str, obj, new androidx.activity.result.a() { // from class: androidx.activity.compose.c
            @Override // androidx.activity.result.a
            public final void a(Object obj2) {
                ActivityResultRegistryKt$rememberLauncherForActivityResult$1.h(x12, obj2);
            }
        });
        return new a(this.f84917d);
    }
}
