package v2;

import U6.j;
import dd.o;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nSupportSQLiteQueryBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteQueryBuilder.kt\nandroidx/sqlite/db/SupportSQLiteQueryBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f239765j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f239766k = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f239767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f239768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String[] f239769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f239770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Object[] f239771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f239772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f239773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public String f239774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f239775i;

    public static final class a {
        public a() {
        }

        @o
        @NotNull
        public final g a(@NotNull String tableName) {
            G.p(tableName, "tableName");
            return new g(tableName);
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ g(String str, C4969v c4969v) {
        this(str);
    }

    @o
    @NotNull
    public static final g c(@NotNull String str) {
        return f239765j.a(str);
    }

    public final void a(StringBuilder sb2, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb2.append(str);
        sb2.append(str2);
    }

    public final void b(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            if (i10 > 0) {
                sb2.append(j.f68738d);
            }
            sb2.append(str);
        }
        sb2.append(' ');
    }

    @NotNull
    public final g d(@Nullable String[] strArr) {
        this.f239769c = strArr;
        return this;
    }

    @NotNull
    public final f e() {
        String str;
        String str2 = this.f239772f;
        if ((str2 == null || str2.length() == 0) && (str = this.f239773g) != null && str.length() != 0) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("SELECT ");
        if (this.f239768b) {
            sb2.append("DISTINCT ");
        }
        String[] strArr = this.f239769c;
        if (strArr == null || strArr.length == 0) {
            sb2.append("* ");
        } else {
            G.m(strArr);
            b(sb2, strArr);
        }
        sb2.append("FROM ");
        sb2.append(this.f239767a);
        a(sb2, " WHERE ", this.f239770d);
        a(sb2, " GROUP BY ", this.f239772f);
        a(sb2, " HAVING ", this.f239773g);
        a(sb2, " ORDER BY ", this.f239774h);
        a(sb2, " LIMIT ", this.f239775i);
        String string = sb2.toString();
        G.o(string, "StringBuilder(capacity).…builderAction).toString()");
        return new C5673b(string, this.f239771e);
    }

    @NotNull
    public final g f() {
        this.f239768b = true;
        return this;
    }

    @NotNull
    public final g g(@Nullable String str) {
        this.f239772f = str;
        return this;
    }

    @NotNull
    public final g h(@Nullable String str) {
        this.f239773g = str;
        return this;
    }

    @NotNull
    public final g i(@NotNull String limit) {
        G.p(limit, "limit");
        boolean zMatches = f239766k.matcher(limit).matches();
        if (limit.length() != 0 && !zMatches) {
            throw new IllegalArgumentException("invalid LIMIT clauses:".concat(limit).toString());
        }
        this.f239775i = limit;
        return this;
    }

    @NotNull
    public final g j(@Nullable String str) {
        this.f239774h = str;
        return this;
    }

    @NotNull
    public final g k(@Nullable String str, @Nullable Object[] objArr) {
        this.f239770d = str;
        this.f239771e = objArr;
        return this;
    }

    public g(String str) {
        this.f239767a = str;
    }
}
