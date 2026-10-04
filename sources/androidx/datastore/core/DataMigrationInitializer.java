package androidx.datastore.core;

import ed.p;
import java.util.List;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DataMigrationInitializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Companion f112307a = new Companion();

    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final <T> p<g<T>, kotlin.coroutines.e<? super L0>, Object> b(@NotNull List<? extends c<T>> migrations) {
            G.p(migrations, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object c(java.util.List<? extends androidx.datastore.core.c<T>> r7, androidx.datastore.core.g<T> r8, kotlin.coroutines.e<? super kotlin.L0> r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                int r1 = r0.f112315e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f112315e = r1
                goto L18
            L13:
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                r0.<init>(r6, r9)
            L18:
                java.lang.Object r9 = r0.f112313c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f112315e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L3c
                if (r2 != r3) goto L34
                java.lang.Object r7 = r0.f112312b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f112311a
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                kotlin.C4885d0.n(r9)     // Catch: java.lang.Throwable -> L32
                goto L69
            L32:
                r9 = move-exception
                goto L82
            L34:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3c:
                java.lang.Object r7 = r0.f112311a
                java.util.List r7 = (java.util.List) r7
                kotlin.C4885d0.n(r9)
                goto L5e
            L44:
                kotlin.C4885d0.n(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f112311a = r9
                r0.f112315e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5d
                goto L81
            L5d:
                r7 = r9
            L5e:
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                ed.l r9 = (ed.l) r9
                r0.f112311a = r8     // Catch: java.lang.Throwable -> L32
                r0.f112312b = r7     // Catch: java.lang.Throwable -> L32
                r0.f112315e = r3     // Catch: java.lang.Throwable -> L32
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L32
                if (r9 != r1) goto L69
            L81:
                return r1
            L82:
                T r2 = r8.f217904a
                if (r2 != 0) goto L89
                r8.f217904a = r9
                goto L69
            L89:
                kotlin.jvm.internal.G.m(r2)
                T r2 = r8.f217904a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.C4987s.a(r2, r9)
                goto L69
            L94:
                T r7 = r8.f217904a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                kotlin.L0 r7 = kotlin.L0.f217464a
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.c(java.util.List, androidx.datastore.core.g, kotlin.coroutines.e):java.lang.Object");
        }

        public Companion(C4969v c4969v) {
        }
    }
}
