package com.cookiegames.smartcookie.search;

import B0.C0920d;
import T3.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.cookiegames.smartcookie.di.K;
import com.cookiegames.smartcookie.p;
import hc.AbstractC4530j;
import hc.H;
import hc.I;
import hc.InterfaceC4536p;
import hc.O;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.L0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.U;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.V;
import kotlin.text.M;
import nc.InterfaceC5267c;
import nc.InterfaceC5271g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nSuggestionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestionsAdapter.kt\ncom/cookiegames/smartcookie/search/SuggestionsAdapter\n+ 2 ContextExtensions.kt\ncom/cookiegames/smartcookie/extensions/ContextExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n41#2:247\n41#2:248\n41#2:249\n766#3:250\n857#3,2:251\n766#3:253\n857#3,2:254\n*S KotlinDebug\n*F\n+ 1 SuggestionsAdapter.kt\ncom/cookiegames/smartcookie/search/SuggestionsAdapter\n*L\n49#1:247\n50#1:248\n51#1:249\n158#1:250\n158#1:251,2\n160#1:253\n160#1:254,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class SuggestionsAdapter extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f147724s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f147725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public List<? extends T3.g> f147726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public W3.s f147727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public u4.e f147728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public Y3.h f147729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Inject
    public H f147730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Inject
    public H f147731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Inject
    public H f147732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Inject
    public C3131a f147733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ArrayList<a.C0110a> f147734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f147735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Drawable f147736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Drawable f147737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Drawable f147738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public z4.m f147739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LayoutInflater f147740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ed.l<? super T3.g, L0> f147741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final View.OnClickListener f147742r;

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.search.SuggestionsAdapter$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ed.l<List<? extends T3.g>, L0> {
        public AnonymousClass1(Object obj) {
            super(1, obj, SuggestionsAdapter.class, "publishResults", "publishResults(Ljava/util/List;)V", 0);
        }

        public final void e(List<? extends T3.g> list) {
            ((SuggestionsAdapter) this.receiver).R(list);
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ L0 invoke(List<? extends T3.g> list) {
            e(list);
            return L0.f217464a;
        }
    }

    @V({"SMAP\nSuggestionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestionsAdapter.kt\ncom/cookiegames/smartcookie/search/SuggestionsAdapter$SearchFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
    public static final class a extends Filter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SuggestionsAdapter f147743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final PublishSubject<CharSequence> f147744b;

        public a(@NotNull SuggestionsAdapter suggestionsAdapter) {
            kotlin.jvm.internal.G.p(suggestionsAdapter, "suggestionsAdapter");
            this.f147743a = suggestionsAdapter;
            this.f147744b = new PublishSubject<>();
        }

        @Override // android.widget.Filter
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convertResultToString(@NotNull Object resultValue) {
            kotlin.jvm.internal.G.p(resultValue, "resultValue");
            return ((T3.g) resultValue).b();
        }

        @NotNull
        public final hc.z<CharSequence> b() {
            hc.z<CharSequence> zVarW2 = this.f147744b.W2();
            kotlin.jvm.internal.G.o(zVarW2, "hide(...)");
            return zVarW2;
        }

        @Override // android.widget.Filter
        @NotNull
        public Filter.FilterResults performFiltering(@Nullable CharSequence charSequence) {
            if (charSequence == null || M.Q3(charSequence)) {
                return new Filter.FilterResults();
            }
            this.f147744b.onNext(M.e6(charSequence));
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = 1;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(@Nullable CharSequence charSequence, @Nullable Filter.FilterResults filterResults) {
            this.f147743a.R(null);
        }
    }

    public SuggestionsAdapter(@NotNull Context context, boolean z10) {
        kotlin.jvm.internal.G.p(context, "context");
        this.f147725a = z10;
        this.f147726b = EmptyList.f217510a;
        this.f147734j = new ArrayList<>();
        a aVar = new a(this);
        this.f147735k = aVar;
        Drawable drawable = C0920d.getDrawable(context, p.h.f144170q4);
        kotlin.jvm.internal.G.m(drawable);
        this.f147736l = drawable;
        Drawable drawable2 = C0920d.getDrawable(context, p.h.f144177r3);
        kotlin.jvm.internal.G.m(drawable2);
        this.f147737m = drawable2;
        Drawable drawable3 = C0920d.getDrawable(context, p.h.f144208v2);
        kotlin.jvm.internal.G.m(drawable3);
        this.f147738n = drawable3;
        this.f147740p = LayoutInflater.from(context);
        this.f147742r = new View.OnClickListener() { // from class: com.cookiegames.smartcookie.search.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuggestionsAdapter.Q(this.f147780a, view);
            }
        };
        K.b(context).D(this);
        this.f147739o = z10 ? new z4.j() : O().d();
        S();
        AbstractC4530j<List<T3.g>> abstractC4530jG4 = W(aVar.b()).e6(J()).g4(L(), false, AbstractC4530j.f202668a);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
        abstractC4530jG4.Y5(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.search.x
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                SuggestionsAdapter.d(anonymousClass1, obj);
            }
        });
    }

    public static final void D(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final List I(SuggestionsAdapter suggestionsAdapter, String str) {
        int value = suggestionsAdapter.P().S0().getValue() + 3;
        ArrayList<a.C0110a> arrayList = suggestionsAdapter.f147734j;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            a.C0110a c0110a = arrayList.get(i10);
            i10++;
            String str2 = c0110a.f68305h;
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.G.o(locale, "getDefault(...)");
            String lowerCase = str2.toLowerCase(locale);
            kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
            if (kotlin.text.F.L2(lowerCase, str, false, 2, null)) {
                arrayList2.add(c0110a);
            }
        }
        ArrayList<a.C0110a> arrayList3 = suggestionsAdapter.f147734j;
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            a.C0110a c0110a2 = arrayList3.get(i11);
            i11++;
            if (M.p3(c0110a2.f68304g, str, false, 2, null)) {
                arrayList4.add(c0110a2);
            }
        }
        return U.O5(U.e2(U.I4(arrayList2, arrayList4)), value);
    }

    public static final void Q(SuggestionsAdapter suggestionsAdapter, View view) {
        ed.l<? super T3.g, L0> lVar = suggestionsAdapter.f147741q;
        if (lVar != null) {
            Object tag = view.getTag();
            kotlin.jvm.internal.G.n(tag, "null cannot be cast to non-null type com.cookiegames.smartcookie.database.WebPage");
            lVar.invoke((T3.g) tag);
        }
    }

    public static final L0 T(SuggestionsAdapter suggestionsAdapter, List list) {
        suggestionsAdapter.f147734j.clear();
        suggestionsAdapter.f147734j.addAll(list);
        return L0.f217464a;
    }

    public static final void U(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final Publisher X(SuggestionsAdapter suggestionsAdapter, AbstractC4530j upstream) {
        kotlin.jvm.internal.G.p(upstream, "upstream");
        final SuggestionsAdapter$results$3$searchEntries$1 suggestionsAdapter$results$3$searchEntries$1 = new SuggestionsAdapter$results$3$searchEntries$1(suggestionsAdapter.f147739o);
        AbstractC4530j abstractC4530jE6 = upstream.F2(new nc.o() { // from class: com.cookiegames.smartcookie.search.d
            @Override // nc.o
            public final Object apply(Object obj) {
                return SuggestionsAdapter.Y(suggestionsAdapter$results$3$searchEntries$1, obj);
            }
        }, false, Integer.MAX_VALUE).e6(suggestionsAdapter.M());
        EmptyList emptyList = EmptyList.f217510a;
        final AbstractC4530j abstractC4530jC5 = abstractC4530jE6.T5(emptyList).C5();
        final SuggestionsAdapter$results$3$bookmarksEntries$1 suggestionsAdapter$results$3$bookmarksEntries$1 = new SuggestionsAdapter$results$3$bookmarksEntries$1(suggestionsAdapter);
        final AbstractC4530j abstractC4530jC52 = upstream.F2(new nc.o() { // from class: com.cookiegames.smartcookie.search.y
            @Override // nc.o
            public final Object apply(Object obj) {
                return SuggestionsAdapter.Z(suggestionsAdapter$results$3$bookmarksEntries$1, obj);
            }
        }, false, Integer.MAX_VALUE).e6(suggestionsAdapter.J()).T5(emptyList).C5();
        final SuggestionsAdapter$results$3$historyEntries$1 suggestionsAdapter$results$3$historyEntries$1 = new SuggestionsAdapter$results$3$historyEntries$1(suggestionsAdapter.K());
        final AbstractC4530j abstractC4530jC53 = upstream.F2(new nc.o() { // from class: com.cookiegames.smartcookie.search.z
            @Override // nc.o
            public final Object apply(Object obj) {
                return SuggestionsAdapter.a0(suggestionsAdapter$results$3$historyEntries$1, obj);
            }
        }, false, Integer.MAX_VALUE).e6(suggestionsAdapter.J()).U5(emptyList).C5();
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.search.A
            @Override // ed.l
            public final Object invoke(Object obj) {
                AbstractC4530j abstractC4530j = abstractC4530jC52;
                SuggestionsAdapter.r(abstractC4530j, (List) obj);
                return abstractC4530j;
            }
        };
        nc.o oVar = new nc.o() { // from class: com.cookiegames.smartcookie.search.B
            @Override // nc.o
            public final Object apply(Object obj) {
                return SuggestionsAdapter.c0(lVar, obj);
            }
        };
        final ed.l lVar2 = new ed.l() { // from class: com.cookiegames.smartcookie.search.C
            @Override // ed.l
            public final Object invoke(Object obj) {
                AbstractC4530j abstractC4530j = abstractC4530jC53;
                SuggestionsAdapter.p(abstractC4530j, (List) obj);
                return abstractC4530j;
            }
        };
        nc.o oVar2 = new nc.o() { // from class: com.cookiegames.smartcookie.search.D
            @Override // nc.o
            public final Object apply(Object obj) {
                return SuggestionsAdapter.e0(lVar2, obj);
            }
        };
        final E e10 = new E();
        AbstractC4530j abstractC4530jN3 = abstractC4530jC52.n3(abstractC4530jC53, oVar, oVar2, new InterfaceC5267c() { // from class: com.cookiegames.smartcookie.search.F
            @Override // nc.InterfaceC5267c
            public final Object apply(Object obj, Object obj2) {
                return SuggestionsAdapter.g0(e10, obj, obj2);
            }
        });
        final ed.l lVar3 = new ed.l() { // from class: com.cookiegames.smartcookie.search.e
            @Override // ed.l
            public final Object invoke(Object obj) {
                return SuggestionsAdapter.h0(abstractC4530jC5, (AbstractC4530j) obj);
            }
        };
        return abstractC4530jN3.t0(new InterfaceC4536p() { // from class: com.cookiegames.smartcookie.search.o
            @Override // hc.InterfaceC4536p
            public final Publisher a(AbstractC4530j abstractC4530j) {
                return SuggestionsAdapter.o0(lVar3, abstractC4530j);
            }
        });
    }

    public static final O Y(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (O) lVar.invoke(p02);
    }

    public static final O Z(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (O) lVar.invoke(p02);
    }

    public static final O a0(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (O) lVar.invoke(p02);
    }

    public static void b(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final Publisher b0(AbstractC4530j abstractC4530j, List it) {
        kotlin.jvm.internal.G.p(it, "it");
        return abstractC4530j;
    }

    public static final Publisher c0(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (Publisher) lVar.invoke(p02);
    }

    public static void d(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final Publisher d0(AbstractC4530j abstractC4530j, List it) {
        kotlin.jvm.internal.G.p(it, "it");
        return abstractC4530j;
    }

    public static final Publisher e0(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (Publisher) lVar.invoke(p02);
    }

    public static final Pair f0(List t12, List t22) {
        kotlin.jvm.internal.G.p(t12, "t1");
        kotlin.jvm.internal.G.p(t22, "t2");
        return new Pair(t12, t22);
    }

    public static final Pair g0(ed.p pVar, Object p02, Object p12) {
        kotlin.jvm.internal.G.p(p02, "p0");
        kotlin.jvm.internal.G.p(p12, "p1");
        return (Pair) pVar.invoke(p02, p12);
    }

    public static Publisher h(AbstractC4530j abstractC4530j, Pair it) {
        kotlin.jvm.internal.G.p(it, "it");
        return abstractC4530j;
    }

    public static final Publisher h0(final AbstractC4530j abstractC4530j, final AbstractC4530j bookmarksAndHistory) {
        kotlin.jvm.internal.G.p(bookmarksAndHistory, "bookmarksAndHistory");
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.search.g
            @Override // ed.l
            public final Object invoke(Object obj) {
                AbstractC4530j abstractC4530j2 = bookmarksAndHistory;
                SuggestionsAdapter.h(abstractC4530j2, (Pair) obj);
                return abstractC4530j2;
            }
        };
        nc.o oVar = new nc.o() { // from class: com.cookiegames.smartcookie.search.h
            @Override // nc.o
            public final Object apply(Object obj) {
                return SuggestionsAdapter.j0(lVar, obj);
            }
        };
        final ed.l lVar2 = new ed.l() { // from class: com.cookiegames.smartcookie.search.i
            @Override // ed.l
            public final Object invoke(Object obj) {
                AbstractC4530j abstractC4530j2 = abstractC4530j;
                SuggestionsAdapter.y(abstractC4530j2, (List) obj);
                return abstractC4530j2;
            }
        };
        nc.o oVar2 = new nc.o() { // from class: com.cookiegames.smartcookie.search.j
            @Override // nc.o
            public final Object apply(Object obj) {
                return SuggestionsAdapter.l0(lVar2, obj);
            }
        };
        final k kVar = new k();
        return bookmarksAndHistory.n3(abstractC4530j, oVar, oVar2, new InterfaceC5267c() { // from class: com.cookiegames.smartcookie.search.l
            @Override // nc.InterfaceC5267c
            public final Object apply(Object obj, Object obj2) {
                return SuggestionsAdapter.n0(kVar, obj, obj2);
            }
        });
    }

    public static final Publisher i0(AbstractC4530j abstractC4530j, Pair it) {
        kotlin.jvm.internal.G.p(it, "it");
        return abstractC4530j;
    }

    public static final Publisher j0(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (Publisher) lVar.invoke(p02);
    }

    public static final Publisher k0(AbstractC4530j abstractC4530j, List it) {
        kotlin.jvm.internal.G.p(it, "it");
        return abstractC4530j;
    }

    public static final Publisher l0(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (Publisher) lVar.invoke(p02);
    }

    public static final Triple m0(Pair pair, List t22) {
        kotlin.jvm.internal.G.p(pair, "<destruct>");
        kotlin.jvm.internal.G.p(t22, "t2");
        A a10 = pair.f217467a;
        kotlin.jvm.internal.G.o(a10, "component1(...)");
        B b10 = pair.f217468b;
        kotlin.jvm.internal.G.o(b10, "component2(...)");
        return new Triple((List) a10, (List) b10, t22);
    }

    public static final Triple n0(ed.p pVar, Object p02, Object p12) {
        kotlin.jvm.internal.G.p(p02, "p0");
        kotlin.jvm.internal.G.p(p12, "p1");
        return (Triple) pVar.invoke(p02, p12);
    }

    public static final Publisher o0(ed.l lVar, AbstractC4530j p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (Publisher) lVar.invoke(p02);
    }

    public static Publisher p(AbstractC4530j abstractC4530j, List it) {
        kotlin.jvm.internal.G.p(it, "it");
        return abstractC4530j;
    }

    public static final Publisher p0(ed.l lVar, AbstractC4530j p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (Publisher) lVar.invoke(p02);
    }

    public static final List q0(SuggestionsAdapter suggestionsAdapter, Triple triple) {
        kotlin.jvm.internal.G.p(triple, "<destruct>");
        List list = (List) triple.f217480a;
        List list2 = (List) triple.f217481b;
        C c10 = triple.f217482c;
        kotlin.jvm.internal.G.o(c10, "component3(...)");
        List list3 = (List) c10;
        int value = suggestionsAdapter.P().S0().getValue() + 3;
        int size = list2.size();
        if (2 <= size) {
            size = 2;
        }
        int i10 = value - size;
        int size2 = list3.size();
        if (1 <= size2) {
            size2 = 1;
        }
        int i11 = i10 - size2;
        int size3 = list.size();
        if (i11 <= size3) {
            size3 = i11;
        }
        int i12 = value - size3;
        int size4 = list3.size();
        int i13 = i12 - (1 > size4 ? size4 : 1);
        int size5 = list.size();
        if (i11 <= size5) {
            size5 = i11;
        }
        int i14 = value - size5;
        int size6 = list2.size();
        if (i13 <= size6) {
            size6 = i13;
        }
        return U.I4(U.I4(U.O5(list, i11), U.O5(list2, i13)), U.O5(list3, i14 - size6));
    }

    public static Publisher r(AbstractC4530j abstractC4530j, List it) {
        kotlin.jvm.internal.G.p(it, "it");
        return abstractC4530j;
    }

    public static final List r0(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (List) lVar.invoke(p02);
    }

    public static final String s0(CharSequence it) {
        kotlin.jvm.internal.G.p(it, "it");
        String string = it.toString();
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.G.o(locale, "getDefault(...)");
        String lowerCase = string.toLowerCase(locale);
        kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
        return M.e6(lowerCase).toString();
    }

    public static final String t0(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (String) lVar.invoke(p02);
    }

    public static final boolean u0(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return ((Boolean) lVar.invoke(p02)).booleanValue();
    }

    public static Publisher y(AbstractC4530j abstractC4530j, List it) {
        kotlin.jvm.internal.G.p(it, "it");
        return abstractC4530j;
    }

    public final void A0(@Nullable ed.l<? super T3.g, L0> lVar) {
        this.f147741q = lVar;
    }

    public final void B0(@NotNull C3131a c3131a) {
        kotlin.jvm.internal.G.p(c3131a, "<set-?>");
        this.f147733i = c3131a;
    }

    public final void C0(@NotNull u4.e eVar) {
        kotlin.jvm.internal.G.p(eVar, "<set-?>");
        this.f147728d = eVar;
    }

    @NotNull
    public final W3.s G() {
        W3.s sVar = this.f147727c;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.G.S("bookmarkRepository");
        throw null;
    }

    public final I<List<a.C0110a>> H(final String str) {
        I<List<a.C0110a>> iF0 = I.f0(new Callable() { // from class: com.cookiegames.smartcookie.search.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SuggestionsAdapter.I(this.f147764a, str);
            }
        });
        kotlin.jvm.internal.G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @NotNull
    public final H J() {
        H h10 = this.f147730f;
        if (h10 != null) {
            return h10;
        }
        kotlin.jvm.internal.G.S("databaseScheduler");
        throw null;
    }

    @NotNull
    public final Y3.h K() {
        Y3.h hVar = this.f147729e;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.G.S("historyRepository");
        throw null;
    }

    @NotNull
    public final H L() {
        H h10 = this.f147732h;
        if (h10 != null) {
            return h10;
        }
        kotlin.jvm.internal.G.S("mainScheduler");
        throw null;
    }

    @NotNull
    public final H M() {
        H h10 = this.f147731g;
        if (h10 != null) {
            return h10;
        }
        kotlin.jvm.internal.G.S("networkScheduler");
        throw null;
    }

    @Nullable
    public final ed.l<T3.g, L0> N() {
        return this.f147741q;
    }

    @NotNull
    public final C3131a O() {
        C3131a c3131a = this.f147733i;
        if (c3131a != null) {
            return c3131a;
        }
        kotlin.jvm.internal.G.S("searchEngineProvider");
        throw null;
    }

    @NotNull
    public final u4.e P() {
        u4.e eVar = this.f147728d;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.G.S("userPreferences");
        throw null;
    }

    public final void R(List<? extends T3.g> list) {
        if (list == null) {
            notifyDataSetChanged();
        } else {
            if (list.equals(this.f147726b)) {
                return;
            }
            this.f147726b = list;
            notifyDataSetChanged();
        }
    }

    public final void S() {
        I<List<a.C0110a>> iZ0 = G().d().Z0(J());
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.search.m
            @Override // ed.l
            public final Object invoke(Object obj) {
                return SuggestionsAdapter.T(this.f147771a, (List) obj);
            }
        };
        iZ0.X0(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.search.n
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                SuggestionsAdapter.b(lVar, obj);
            }
        }, Functions.f202952f);
    }

    public final void V() {
        this.f147739o = this.f147725a ? new z4.j() : O().d();
    }

    public final AbstractC4530j<List<T3.g>> W(hc.z<CharSequence> zVar) {
        final p pVar = new p();
        hc.z<R> zVarU3 = zVar.u3(new nc.o() { // from class: com.cookiegames.smartcookie.search.q
            @Override // nc.o
            public final Object apply(Object obj) {
                return SuggestionsAdapter.t0(pVar, obj);
            }
        });
        final SuggestionsAdapter$results$2 suggestionsAdapter$results$2 = SuggestionsAdapter$results$2.f147745a;
        AbstractC4530j abstractC4530jC5 = zVarU3.b2(new nc.r() { // from class: com.cookiegames.smartcookie.search.r
            @Override // nc.r
            public final boolean test(Object obj) {
                return SuggestionsAdapter.u0(suggestionsAdapter$results$2, obj);
            }
        }).Q6(BackpressureStrategy.LATEST).C5();
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.search.s
            @Override // ed.l
            public final Object invoke(Object obj) {
                return SuggestionsAdapter.X(this.f147776a, (AbstractC4530j) obj);
            }
        };
        AbstractC4530j abstractC4530jT0 = abstractC4530jC5.t0(new InterfaceC4536p() { // from class: com.cookiegames.smartcookie.search.t
            @Override // hc.InterfaceC4536p
            public final Publisher a(AbstractC4530j abstractC4530j) {
                return SuggestionsAdapter.p0(lVar, abstractC4530j);
            }
        });
        final ed.l lVar2 = new ed.l() { // from class: com.cookiegames.smartcookie.search.u
            @Override // ed.l
            public final Object invoke(Object obj) {
                return SuggestionsAdapter.q0(this.f147778a, (Triple) obj);
            }
        };
        AbstractC4530j<List<T3.g>> abstractC4530jD3 = abstractC4530jT0.D3(new nc.o() { // from class: com.cookiegames.smartcookie.search.v
            @Override // nc.o
            public final Object apply(Object obj) {
                return SuggestionsAdapter.r0(lVar2, obj);
            }
        });
        kotlin.jvm.internal.G.o(abstractC4530jD3, "map(...)");
        return abstractC4530jD3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f147726b.size();
    }

    @Override // android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return this.f147735k;
    }

    @Override // android.widget.Adapter
    @Nullable
    public Object getItem(int i10) {
        if (i10 > this.f147726b.size() || i10 < 0) {
            return null;
        }
        return this.f147726b.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @NotNull
    public View getView(int i10, @Nullable View view, @NotNull ViewGroup parent) {
        C3133c c3133c;
        Drawable drawable;
        kotlin.jvm.internal.G.p(parent, "parent");
        if (view == null) {
            view = this.f147740p.inflate(p.m.f145308w3, parent, false);
            kotlin.jvm.internal.G.o(view, "inflate(...)");
            c3133c = new C3133c(view);
            view.setTag(c3133c);
        } else {
            Object tag = view.getTag();
            kotlin.jvm.internal.G.n(tag, "null cannot be cast to non-null type com.cookiegames.smartcookie.search.SuggestionViewHolder");
            c3133c = (C3133c) tag;
        }
        T3.g gVar = this.f147726b.get(i10);
        c3133c.f147759b.setText(gVar.a());
        c3133c.f147760c.setText(gVar.b());
        if (gVar instanceof T3.a) {
            drawable = this.f147738n;
        } else if (gVar instanceof T3.e) {
            drawable = this.f147736l;
        } else {
            if (!(gVar instanceof T3.d)) {
                throw new NoWhenBranchMatchedException();
            }
            drawable = this.f147737m;
        }
        c3133c.f147761d.setTag(gVar);
        c3133c.f147761d.setOnClickListener(this.f147742r);
        c3133c.f147758a.setImageDrawable(drawable);
        return view;
    }

    public final void v0(@NotNull W3.s sVar) {
        kotlin.jvm.internal.G.p(sVar, "<set-?>");
        this.f147727c = sVar;
    }

    public final void w0(@NotNull H h10) {
        kotlin.jvm.internal.G.p(h10, "<set-?>");
        this.f147730f = h10;
    }

    public final void x0(@NotNull Y3.h hVar) {
        kotlin.jvm.internal.G.p(hVar, "<set-?>");
        this.f147729e = hVar;
    }

    public final void y0(@NotNull H h10) {
        kotlin.jvm.internal.G.p(h10, "<set-?>");
        this.f147732h = h10;
    }

    public final void z0(@NotNull H h10) {
        kotlin.jvm.internal.G.p(h10, "<set-?>");
        this.f147731g = h10;
    }
}
