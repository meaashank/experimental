package com.prism.lib_google_billing;

import android.content.Context;
import com.prism.lib_google_billing.p;
import java.util.List;
import java.util.Locale;
import kotlin.collections.I;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f194113a = "UNKNOWN";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<String> f194114b = I.Q("no_ads", "no_ad_per_1_mo", "apphider_hider_subscription", "lifetime", "Lifetime", "hider_subscription");

    @NotNull
    public static final String a(@NotNull Context context, @NotNull String isoPeriod, @NotNull String price) {
        G.p(context, "<this>");
        G.p(isoPeriod, "isoPeriod");
        G.p(price, "price");
        String upperCase = isoPeriod.toUpperCase(Locale.ROOT);
        G.o(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != 78476) {
            if (iHashCode != 78486) {
                if (iHashCode == 78488 && upperCase.equals("P1Y")) {
                    price = context.getString(p.n.f192547v2, price);
                }
            } else if (upperCase.equals("P1W")) {
                price = context.getString(p.n.f192543u2, price);
            }
        } else if (upperCase.equals("P1M")) {
            price = context.getString(p.n.f192539t2, price);
        }
        G.m(price);
        return price;
    }

    @NotNull
    public static final List<String> b() {
        return f194114b;
    }

    @NotNull
    public static final String c(@NotNull Context context, @NotNull String isoPeriod) {
        G.p(context, "<this>");
        G.p(isoPeriod, "isoPeriod");
        String upperCase = isoPeriod.toUpperCase(Locale.ROOT);
        G.o(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != 78476) {
            if (iHashCode != 78486) {
                if (iHashCode == 78488 && upperCase.equals("P1Y")) {
                    isoPeriod = context.getString(p.n.f192559y2);
                }
            } else if (upperCase.equals("P1W")) {
                isoPeriod = context.getString(p.n.f192555x2);
            }
        } else if (upperCase.equals("P1M")) {
            isoPeriod = context.getString(p.n.f192535s2);
        }
        G.m(isoPeriod);
        return isoPeriod;
    }

    @NotNull
    public static final String d(@NotNull String str) {
        G.p(str, "<this>");
        return str.equalsIgnoreCase("P1W") ? "7" : str.equalsIgnoreCase("P1M") ? "30" : str.equalsIgnoreCase("P1Y") ? "365" : f194113a;
    }

    @NotNull
    public static final String e(@NotNull Context context, @Nullable String str) {
        G.p(context, "<this>");
        String string = (str == null || str.length() == 0) ? "" : context.getString(p.n.f192531r2, str);
        G.m(string);
        return string;
    }
}
