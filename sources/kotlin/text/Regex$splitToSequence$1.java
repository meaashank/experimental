package kotlin.text;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5002o;

/* JADX INFO: loaded from: classes7.dex */
@Vc.d(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {296, 304, 308}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "$this$sequence", "matcher", "nextStart", "splitCount", "$this$sequence", "matcher", "nextStart", "splitCount"}, nl = {297, 305, 309}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
public final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super String>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f218267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f218269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Regex f218270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ CharSequence f218271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f218272i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i10, kotlin.coroutines.e<? super Regex$splitToSequence$1> eVar) {
        super(2, eVar);
        this.f218270g = regex;
        this.f218271h = charSequence;
        this.f218272i = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e<L0> create(Object obj, kotlin.coroutines.e<?> eVar) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.f218270g, this.f218271h, this.f218272i, eVar);
        regex$splitToSequence$1.f218269f = obj;
        return regex$splitToSequence$1;
    }

    @Override // ed.p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AbstractC5002o<? super String> abstractC5002o, kotlin.coroutines.e<? super L0> eVar) {
        return ((Regex$splitToSequence$1) create(abstractC5002o, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r0.b(r4, r11) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        if (r0.b(r12, r11) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0072 -> B:22:0x0073). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f218269f
            kotlin.sequences.o r0 = (kotlin.sequences.AbstractC5002o) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r11.f218268e
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L38
            if (r2 == r6) goto L2f
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r0 = r11.f218265b
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            kotlin.C4885d0.n(r12)
            goto La7
        L1d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L25:
            int r2 = r11.f218267d
            java.lang.Object r7 = r11.f218265b
            java.util.regex.Matcher r7 = (java.util.regex.Matcher) r7
            kotlin.C4885d0.n(r12)
            goto L73
        L2f:
            java.lang.Object r0 = r11.f218265b
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            kotlin.C4885d0.n(r12)
            goto Lbd
        L38:
            kotlin.C4885d0.n(r12)
            kotlin.text.Regex r12 = r11.f218270g
            java.util.regex.Pattern r12 = r12.f218258a
            java.lang.CharSequence r2 = r11.f218271h
            java.util.regex.Matcher r12 = r12.matcher(r2)
            int r2 = r11.f218272i
            if (r2 == r6) goto Laa
            boolean r2 = r12.find()
            if (r2 != 0) goto L50
            goto Laa
        L50:
            r2 = 0
            r7 = r12
            r12 = r2
        L53:
            java.lang.CharSequence r8 = r11.f218271h
            int r9 = r7.start()
            java.lang.CharSequence r8 = r8.subSequence(r2, r9)
            java.lang.String r8 = r8.toString()
            r11.f218269f = r0
            r11.f218265b = r7
            r11.f218266c = r2
            r11.f218267d = r12
            r11.f218268e = r4
            java.lang.Object r2 = r0.b(r8, r11)
            if (r2 != r1) goto L72
            goto Lbc
        L72:
            r2 = r12
        L73:
            int r12 = r7.end()
            int r2 = r2 + r6
            int r8 = r11.f218272i
            int r8 = r8 - r6
            if (r2 == r8) goto L88
            boolean r8 = r7.find()
            if (r8 != 0) goto L84
            goto L88
        L84:
            r10 = r2
            r2 = r12
            r12 = r10
            goto L53
        L88:
            java.lang.CharSequence r4 = r11.f218271h
            int r6 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r12, r6)
            java.lang.String r4 = r4.toString()
            r11.f218269f = r5
            r11.f218265b = r5
            r11.f218266c = r12
            r11.f218267d = r2
            r11.f218268e = r3
            java.lang.Object r12 = r0.b(r4, r11)
            if (r12 != r1) goto La7
            goto Lbc
        La7:
            kotlin.L0 r12 = kotlin.L0.f217464a
            return r12
        Laa:
            java.lang.CharSequence r12 = r11.f218271h
            java.lang.String r12 = r12.toString()
            r11.f218269f = r5
            r11.f218265b = r5
            r11.f218268e = r6
            java.lang.Object r12 = r0.b(r12, r11)
            if (r12 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            kotlin.L0 r12 = kotlin.L0.f217464a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex$splitToSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
