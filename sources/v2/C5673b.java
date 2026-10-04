package v2;

import dd.o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5673b implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f239762c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f239763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object[] f239764b;

    /* JADX INFO: renamed from: v2.b$a */
    public static final class a {
        public a() {
        }

        public final void a(e eVar, int i10, Object obj) {
            if (obj == null) {
                eVar.X1(i10);
                return;
            }
            if (obj instanceof byte[]) {
                eVar.J1(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                eVar.t2(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                eVar.t2(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                eVar.E1(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                eVar.E1(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                eVar.E1(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                eVar.E1(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                eVar.t1(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                eVar.E1(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        @o
        public final void b(@NotNull e statement, @Nullable Object[] objArr) {
            G.p(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        public a(C4969v c4969v) {
        }
    }

    public C5673b(@NotNull String query, @Nullable Object[] objArr) {
        G.p(query, "query");
        this.f239763a = query;
        this.f239764b = objArr;
    }

    @o
    public static final void a(@NotNull e eVar, @Nullable Object[] objArr) {
        f239762c.b(eVar, objArr);
    }

    @Override // v2.f
    public int d() {
        Object[] objArr = this.f239764b;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // v2.f
    @NotNull
    public String k() {
        return this.f239763a;
    }

    @Override // v2.f
    public void l(@NotNull e statement) {
        G.p(statement, "statement");
        f239762c.b(statement, this.f239764b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5673b(@NotNull String query) {
        this(query, null);
        G.p(query, "query");
    }
}
