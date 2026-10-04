package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC4855b;
import kotlin.collections.AbstractC4859d;
import kotlin.sequences.S;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.InterfaceC5023o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.text.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5024p implements InterfaceC5023o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Matcher f218363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CharSequence f218364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC5021m f218365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public List<String> f218366d;

    public C5024p(@NotNull Matcher matcher, @NotNull CharSequence input) {
        kotlin.jvm.internal.G.p(matcher, "matcher");
        kotlin.jvm.internal.G.p(input, "input");
        this.f218363a = matcher;
        this.f218364b = input;
        this.f218365c = new b();
    }

    public static final MatchResult e(C5024p c5024p) {
        return c5024p.f218363a;
    }

    @Override // kotlin.text.InterfaceC5023o
    @NotNull
    public InterfaceC5023o.b a() {
        return new InterfaceC5023o.b(this);
    }

    @Override // kotlin.text.InterfaceC5023o
    @NotNull
    public InterfaceC5021m b() {
        return this.f218365c;
    }

    @Override // kotlin.text.InterfaceC5023o
    @NotNull
    public List<String> c() {
        if (this.f218366d == null) {
            this.f218366d = new a();
        }
        List<String> list = this.f218366d;
        kotlin.jvm.internal.G.m(list);
        return list;
    }

    @Override // kotlin.text.InterfaceC5023o
    @NotNull
    public md.l d() {
        return C5026s.i(this.f218363a);
    }

    public final MatchResult f() {
        return this.f218363a;
    }

    @Override // kotlin.text.InterfaceC5023o
    @NotNull
    public String getValue() {
        String strGroup = this.f218363a.group();
        kotlin.jvm.internal.G.o(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.InterfaceC5023o
    @Nullable
    public InterfaceC5023o next() {
        int iEnd = this.f218363a.end() + (this.f218363a.end() == this.f218363a.start() ? 1 : 0);
        if (iEnd > this.f218364b.length()) {
            return null;
        }
        Matcher matcher = this.f218363a.pattern().matcher(this.f218364b);
        kotlin.jvm.internal.G.o(matcher, "matcher(...)");
        return C5026s.f(matcher, iEnd, this.f218364b);
    }

    /* JADX INFO: renamed from: kotlin.text.p$a */
    public static final class a extends AbstractC4859d<String> {
        public a() {
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains(obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return C5024p.this.f218363a.groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = C5024p.this.f218363a.group(i10);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int i(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        public /* bridge */ int j(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((Object) str);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.p$b */
    public static final class b extends AbstractC4855b<C5020l> implements InterfaceC5022n {
        public b() {
        }

        public static C5020l h(b bVar, int i10) {
            return bVar.get(i10);
        }

        public static final C5020l j(b bVar, int i10) {
            return bVar.get(i10);
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C5020l) {
                return super.contains((C5020l) obj);
            }
            return false;
        }

        @Override // kotlin.text.InterfaceC5021m
        public C5020l get(int i10) {
            md.l lVarJ = C5026s.j(C5024p.this.f218363a, i10);
            if (lVarJ.f221139a < 0) {
                return null;
            }
            String strGroup = C5024p.this.f218363a.group(i10);
            kotlin.jvm.internal.G.o(strGroup, "group(...)");
            return new C5020l(strGroup, lVarJ);
        }

        @Override // kotlin.collections.AbstractC4855b
        public int getSize() {
            return C5024p.this.f218363a.groupCount() + 1;
        }

        public /* bridge */ boolean i(C5020l c5020l) {
            return super.contains(c5020l);
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C5020l> iterator() {
            return new S.a((kotlin.sequences.S) SequencesKt___SequencesKt.N1(kotlin.collections.U.E1(kotlin.collections.I.K(this)), new ed.l() { // from class: kotlin.text.q
                @Override // ed.l
                public final Object invoke(Object obj) {
                    return this.f218369a.get(((Integer) obj).intValue());
                }
            }));
        }

        @Override // kotlin.text.InterfaceC5022n
        public C5020l get(String name) {
            kotlin.jvm.internal.G.p(name, "name");
            return Xc.n.f79086a.c(C5024p.this.f218363a, name);
        }
    }
}
