package androidx.datastore.migrations;

import Vc.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.appcompat.widget.C1498d;
import androidx.datastore.core.c;
import dd.k;
import dd.o;
import e.InterfaceC4345t;
import e.T;
import ed.InterfaceC4376a;
import ed.p;
import ed.q;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.C4885d0;
import kotlin.G;
import kotlin.I;
import kotlin.L0;
import kotlin.collections.U;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesMigration<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p<T, e<? super Boolean>, Object> f112441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final q<b, T, e<? super T>, Object> f112442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Context f112443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f112444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final G f112445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Set<String> f112446f;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    @d(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<T, e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112447a;

        public AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final e<L0> create(@Nullable Object obj, @NotNull e<?> eVar) {
            return new AnonymousClass1(2, eVar);
        }

        @Nullable
        public final Object e(T t10, @Nullable e<? super Boolean> eVar) throws Throwable {
            ((AnonymousClass1) create(t10, eVar)).invokeSuspend(L0.f217464a);
            return Boolean.TRUE;
        }

        @Override // ed.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, e<? super Boolean> eVar) throws Throwable {
            e(obj, eVar);
            return Boolean.TRUE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f112447a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    @d(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<T, e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112448a;

        public AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final e<L0> create(@Nullable Object obj, @NotNull e<?> eVar) {
            return new AnonymousClass2(2, eVar);
        }

        @Nullable
        public final Object e(T t10, @Nullable e<? super Boolean> eVar) throws Throwable {
            ((AnonymousClass2) create(t10, eVar)).invokeSuspend(L0.f217464a);
            return Boolean.TRUE;
        }

        @Override // ed.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, e<? super Boolean> eVar) throws Throwable {
            e(obj, eVar);
            return Boolean.TRUE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f112448a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    @d(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements p<T, e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112449a;

        public AnonymousClass3(e<? super AnonymousClass3> eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final e<L0> create(@Nullable Object obj, @NotNull e<?> eVar) {
            return new AnonymousClass3(2, eVar);
        }

        @Nullable
        public final Object e(T t10, @Nullable e<? super Boolean> eVar) throws Throwable {
            ((AnonymousClass3) create(t10, eVar)).invokeSuspend(L0.f217464a);
            return Boolean.TRUE;
        }

        @Override // ed.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, e<? super Boolean> eVar) throws Throwable {
            e(obj, eVar);
            return Boolean.TRUE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f112449a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
            return Boolean.TRUE;
        }
    }

    @T(24)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f112452a = new a();

        @o
        @InterfaceC4345t
        public static final boolean a(@NotNull Context context, @NotNull String name) {
            kotlin.jvm.internal.G.p(context, "context");
            kotlin.jvm.internal.G.p(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull q<? super b, ? super T, ? super e<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.G.p(migrate, "migrate");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.c
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1) r0
            int r1 = r0.f112456d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112456d = r1
            goto L18
        L13:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f112454b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f112456d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f112453a
            androidx.datastore.migrations.SharedPreferencesMigration r5 = (androidx.datastore.migrations.SharedPreferencesMigration) r5
            kotlin.C4885d0.n(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C4885d0.n(r6)
            ed.p<T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f112441a
            r0.f112453a = r4
            r0.f112456d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4f:
            java.util.Set<java.lang.String> r6 = r5.f112446f
            r0 = 0
            if (r6 != 0) goto L6a
            android.content.SharedPreferences r5 = r5.e()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.G.o(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L68
            goto L94
        L68:
            r3 = r0
            goto L94
        L6a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.e()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L7e
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7e
            goto L68
        L7e:
            java.util.Iterator r6 = r6.iterator()
        L82:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L82
        L94:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.a(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.datastore.core.c
    @Nullable
    public Object b(@NotNull e<? super L0> eVar) throws IOException {
        L0 l02;
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set<String> set = this.f112446f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.f112443c) != null && (str = this.f112444d) != null) {
            d(context, str);
        }
        Set<String> set2 = this.f112446f;
        if (set2 == null) {
            l02 = null;
        } else {
            set2.clear();
            l02 = L0.f217464a;
        }
        return l02 == CoroutineSingletons.COROUTINE_SUSPENDED ? l02 : L0.f217464a;
    }

    @Override // androidx.datastore.core.c
    @Nullable
    public Object c(T t10, @NotNull e<? super T> eVar) {
        return this.f112442b.invoke(new b(e(), this.f112446f), t10, eVar);
    }

    public final void d(Context context, String str) throws IOException {
        if (Build.VERSION.SDK_INT >= 24) {
            if (!a.a(context, str)) {
                throw new IOException(kotlin.jvm.internal.G.C("Unable to delete SharedPreferences: ", str));
            }
        } else {
            File fileG = g(context, str);
            File fileF = f(fileG);
            fileG.delete();
            fileF.delete();
        }
    }

    public final SharedPreferences e() {
        return (SharedPreferences) this.f112445e.getValue();
    }

    public final File f(File file) {
        return new File(kotlin.jvm.internal.G.C(file.getPath(), ".bak"));
    }

    public final File g(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), kotlin.jvm.internal.G.C(str, C1498d.f86308y));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull q<? super b, ? super T, ? super e<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.G.p(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.G.p(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public SharedPreferencesMigration(@NotNull InterfaceC4376a<? extends SharedPreferences> produceSharedPreferences, @NotNull q<? super b, ? super T, ? super e<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, (Set) null, (p) null, migrate, 6, (C4969v) null);
        kotlin.jvm.internal.G.p(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.G.p(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public SharedPreferencesMigration(@NotNull InterfaceC4376a<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull q<? super b, ? super T, ? super e<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, (p) null, migrate, 4, (C4969v) null);
        kotlin.jvm.internal.G.p(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.G.p(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.G.p(migrate, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharedPreferencesMigration(InterfaceC4376a<? extends SharedPreferences> interfaceC4376a, Set<String> set, p<? super T, ? super e<? super Boolean>, ? extends Object> pVar, q<? super b, ? super T, ? super e<? super T>, ? extends Object> qVar, Context context, String str) {
        this.f112441a = pVar;
        this.f112442b = qVar;
        this.f112443c = context;
        this.f112444d = str;
        this.f112445e = I.a(interfaceC4376a);
        this.f112446f = set == androidx.datastore.migrations.a.a() ? null : U.e6(set);
    }

    public SharedPreferencesMigration(InterfaceC4376a interfaceC4376a, Set set, p pVar, q qVar, Context context, String str, int i10, C4969v c4969v) {
        this((InterfaceC4376a<? extends SharedPreferences>) interfaceC4376a, (Set<String>) set, (i10 & 4) != 0 ? new AnonymousClass1(2, null) : pVar, qVar, context, str);
    }

    public SharedPreferencesMigration(InterfaceC4376a interfaceC4376a, Set set, p pVar, q qVar, int i10, C4969v c4969v) {
        this((InterfaceC4376a<? extends SharedPreferences>) interfaceC4376a, (Set<String>) ((i10 & 2) != 0 ? androidx.datastore.migrations.a.a() : set), (i10 & 4) != 0 ? new AnonymousClass2(2, null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public SharedPreferencesMigration(@NotNull InterfaceC4376a<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull p<? super T, ? super e<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull q<? super b, ? super T, ? super e<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        kotlin.jvm.internal.G.p(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.G.p(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.G.p(shouldRunMigration, "shouldRunMigration");
        kotlin.jvm.internal.G.p(migrate, "migrate");
    }

    public SharedPreferencesMigration(Context context, String str, Set set, p pVar, q qVar, int i10, C4969v c4969v) {
        this(context, str, (i10 & 4) != 0 ? androidx.datastore.migrations.a.a() : set, (i10 & 8) != 0 ? new AnonymousClass3(2, null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public SharedPreferencesMigration(@NotNull final Context context, @NotNull final String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull p<? super T, ? super e<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull q<? super b, ? super T, ? super e<? super T>, ? extends Object> migrate) {
        this(new InterfaceC4376a<SharedPreferences>() { // from class: androidx.datastore.migrations.SharedPreferencesMigration.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPreferencesName, 0);
                kotlin.jvm.internal.G.o(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
                return sharedPreferences;
            }
        }, keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.G.p(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.G.p(shouldRunMigration, "shouldRunMigration");
        kotlin.jvm.internal.G.p(migrate, "migrate");
    }
}
