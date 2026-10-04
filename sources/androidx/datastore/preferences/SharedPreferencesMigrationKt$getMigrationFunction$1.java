package androidx.datastore.preferences;

import Vc.d;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.a;
import ed.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
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
@d(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements q<androidx.datastore.migrations.b, androidx.datastore.preferences.core.a, e<? super androidx.datastore.preferences.core.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f112474c;

    public SharedPreferencesMigrationKt$getMigrationFunction$1(e<? super SharedPreferencesMigrationKt$getMigrationFunction$1> eVar) {
        super(3, eVar);
    }

    @Override // ed.q
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull androidx.datastore.migrations.b bVar, @NotNull androidx.datastore.preferences.core.a aVar, @Nullable e<? super androidx.datastore.preferences.core.a> eVar) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(3, eVar);
        sharedPreferencesMigrationKt$getMigrationFunction$1.f112473b = bVar;
        sharedPreferencesMigrationKt$getMigrationFunction$1.f112474c = aVar;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f112472a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        androidx.datastore.migrations.b bVar = (androidx.datastore.migrations.b) this.f112473b;
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.f112474c;
        Set<a.C0292a<?>> setKeySet = aVar.a().keySet();
        ArrayList arrayList = new ArrayList(J.d0(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((a.C0292a) it.next()).f112491a);
        }
        Map<String, Object> mapC = bVar.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) mapC).entrySet()) {
            if (!arrayList.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MutablePreferences mutablePreferencesD = aVar.d();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                mutablePreferencesD.p(androidx.datastore.preferences.core.c.a(str), value);
            } else if (value instanceof Float) {
                mutablePreferencesD.p(androidx.datastore.preferences.core.c.c(str), value);
            } else if (value instanceof Integer) {
                mutablePreferencesD.p(androidx.datastore.preferences.core.c.d(str), value);
            } else if (value instanceof Long) {
                mutablePreferencesD.p(androidx.datastore.preferences.core.c.e(str), value);
            } else if (value instanceof String) {
                mutablePreferencesD.p(androidx.datastore.preferences.core.c.f(str), value);
            } else if (value instanceof Set) {
                a.C0292a<Set<String>> c0292aG = androidx.datastore.preferences.core.c.g(str);
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                }
                mutablePreferencesD.p(c0292aG, (Set) value);
            } else {
                continue;
            }
        }
        return mutablePreferencesD.e();
    }
}
