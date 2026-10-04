package androidx.datastore.preferences.core;

import ed.p;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
public final class PreferencesKt$edit$2 extends SuspendLambda implements p<a, e<? super a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<MutablePreferences, e<? super L0>, Object> f112490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferencesKt$edit$2(p<? super MutablePreferences, ? super e<? super L0>, ? extends Object> pVar, e<? super PreferencesKt$edit$2> eVar) {
        super(2, eVar);
        this.f112490c = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final e<L0> create(@Nullable Object obj, @NotNull e<?> eVar) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.f112490c, eVar);
        preferencesKt$edit$2.f112489b = obj;
        return preferencesKt$edit$2;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull a aVar, @Nullable e<? super a> eVar) {
        return ((PreferencesKt$edit$2) create(aVar, eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f112488a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.f112489b;
            C4885d0.n(obj);
            return mutablePreferences;
        }
        C4885d0.n(obj);
        MutablePreferences mutablePreferencesD = ((a) this.f112489b).d();
        p<MutablePreferences, e<? super L0>, Object> pVar = this.f112490c;
        this.f112489b = mutablePreferencesD;
        this.f112488a = 1;
        return pVar.invoke(mutablePreferencesD, this) == coroutineSingletons ? coroutineSingletons : mutablePreferencesD;
    }
}
