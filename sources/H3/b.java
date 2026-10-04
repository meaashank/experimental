package H3;

import androidx.compose.runtime.internal.r;
import androidx.compose.ui.input.pointer.C2151s;
import d4.n;
import ed.l;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.L0;
import kotlin.io.u;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import p4.InterfaceC5390c;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f45541c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45542d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f45543e = "HostsFileParser";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f45544f = "127.0.0.1";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f45545g = "0.0.0.0";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f45546h = "::1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f45547i = "localhost";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char f45548j = '#';

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char f45549k = '\t';

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char f45550l = ' ';

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f45551m = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5390c f45552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StringBuilder f45553b;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public b(@NotNull InterfaceC5390c logger) {
        G.p(logger, "logger");
        this.f45552a = logger;
        this.f45553b = new StringBuilder();
    }

    public static final L0 c(b bVar, ArrayList arrayList, String it) {
        G.p(it, "it");
        bVar.d(it, arrayList);
        return L0.f217464a;
    }

    @NotNull
    public final List<U3.a> b(@NotNull InputStreamReader input) throws IOException {
        G.p(input, "input");
        long jCurrentTimeMillis = System.currentTimeMillis();
        final ArrayList arrayList = new ArrayList(100);
        try {
            u.h(input, new l() { // from class: H3.a
                @Override // ed.l
                public final Object invoke(Object obj) {
                    return b.c(this.f45539a, arrayList, (String) obj);
                }
            });
            input.close();
            this.f45552a.log(f45543e, C2151s.a("Parsed ad list in: ", System.currentTimeMillis() - jCurrentTimeMillis, " ms"));
            return arrayList;
        } finally {
        }
    }

    public final void d(String str, List<U3.a> list) {
        this.f45553b.setLength(0);
        this.f45553b.append(str);
        if (this.f45553b.length() <= 0 || this.f45553b.charAt(0) == '#') {
            return;
        }
        n.c(this.f45553b, f45544f, "");
        n.c(this.f45553b, f45545g, "");
        n.c(this.f45553b, f45546h, "");
        n.d(this.f45553b, '\t', ' ');
        int iB = n.b(this.f45553b, f45548j);
        if (iB > 0) {
            this.f45553b.setLength(iB);
        } else if (iB == 0) {
            return;
        }
        n.e(this.f45553b);
        if (this.f45553b.length() <= 0 || n.f(this.f45553b, "localhost")) {
            return;
        }
        while (n.a(this.f45553b, ' ')) {
            StringBuilder sbG = n.g(this.f45553b, 0, n.b(this.f45553b, ' '));
            n.e(sbG);
            String string = sbG.toString();
            G.o(string, "toString(...)");
            list.add(new U3.a(string));
            n.c(this.f45553b, string, "");
            n.e(this.f45553b);
        }
        if (this.f45553b.length() > 0) {
            String string2 = this.f45553b.toString();
            G.o(string2, "toString(...)");
            list.add(new U3.a(string2));
        }
    }
}
