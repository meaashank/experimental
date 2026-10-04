package kotlin.text;

import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5043v;
import kotlin.L0;
import kotlin.O0;
import kotlin.text.HexFormat;

/* JADX INFO: renamed from: kotlin.text.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,845:1\n1107#2,2:846\n*S KotlinDebug\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n*L\n843#1:846,2\n*E\n"})
public final class C5018j {
    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    @Xc.f
    public static final HexFormat a(ed.l<? super HexFormat.Builder, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        HexFormat.Builder builder = new HexFormat.Builder();
        builderAction.invoke(builder);
        return builder.build();
    }

    public static final boolean c(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (kotlin.jvm.internal.G.t(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
