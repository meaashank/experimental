package kotlin.text;

import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: kotlin.text.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n1849#2,3:421\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n21#1:421,3\n*E\n"})
public final class C5026s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.text.s$a */
    @kotlin.jvm.internal.V({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,420:1\n*E\n"})
    public static final class a<T> implements ed.l<T, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f218373a;

        public a(int i10) {
            this.f218373a = i10;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ed.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Enum r32) {
            InterfaceC5016h interfaceC5016h = (InterfaceC5016h) r32;
            return Boolean.valueOf((this.f218373a & interfaceC5016h.getMask()) == interfaceC5016h.getValue());
        }
    }

    public static final InterfaceC5023o f(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new C5024p(matcher, charSequence);
        }
        return null;
    }

    public static final <T extends Enum<T> & InterfaceC5016h> Set<T> g(int i10) {
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static final InterfaceC5023o h(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new C5024p(matcher, charSequence);
        }
        return null;
    }

    public static final md.l i(MatchResult matchResult) {
        return md.u.Y1(matchResult.start(), matchResult.end());
    }

    public static final md.l j(MatchResult matchResult, int i10) {
        return md.u.Y1(matchResult.start(i10), matchResult.end(i10));
    }

    public static final int k(Iterable<? extends InterfaceC5016h> iterable) {
        Iterator<? extends InterfaceC5016h> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}
