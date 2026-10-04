package androidx.datastore.preferences;

import Vc.d;
import androidx.datastore.preferences.core.a;
import ed.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.collections.J;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@d(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements p<androidx.datastore.preferences.core.a, e<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set<String> f112477c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigrationKt$getShouldRunMigration$1(Set<String> set, e<? super SharedPreferencesMigrationKt$getShouldRunMigration$1> eVar) {
        super(2, eVar);
        this.f112477c = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final e<L0> create(@Nullable Object obj, @NotNull e<?> eVar) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.f112477c, eVar);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.f112476b = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull androidx.datastore.preferences.core.a aVar, @Nullable e<? super Boolean> eVar) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create(aVar, eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f112475a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        Set<a.C0292a<?>> setKeySet = ((androidx.datastore.preferences.core.a) this.f112476b).a().keySet();
        ArrayList arrayList = new ArrayList(J.d0(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((a.C0292a) it.next()).f112491a);
        }
        boolean z10 = true;
        if (this.f112477c != SharedPreferencesMigrationKt.g()) {
            Set<String> set = this.f112477c;
            if ((set instanceof Collection) && set.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                        break;
                    }
                }
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
