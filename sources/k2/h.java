package K2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.J;
import kotlin.collections.U;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
public final class h {
    public static final boolean l(h this$0, Set splitPairFilters, Pair pair) {
        G.p(this$0, "this$0");
        G.p(splitPairFilters, "$splitPairFilters");
        G.o(pair, "(first, second)");
        Activity activity = (Activity) pair.first;
        Intent intent = (Intent) pair.second;
        Set set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((s) it.next()).d(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean n(h this$0, Set splitPairFilters, Pair pair) {
        G.p(this$0, "this$0");
        G.p(splitPairFilters, "$splitPairFilters");
        G.o(pair, "(first, second)");
        Activity activity = (Activity) pair.first;
        Activity activity2 = (Activity) pair.second;
        Set set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((s) it.next()).e(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean p(Set activityFilters, Activity activity) {
        G.p(activityFilters, "$activityFilters");
        Set<a> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (a aVar : set) {
            G.o(activity, "activity");
            if (aVar.c(activity)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean r(Set activityFilters, Intent intent) {
        G.p(activityFilters, "$activityFilters");
        Set<a> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (a aVar : set) {
            G.o(intent, "intent");
            if (aVar.d(intent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean t(v splitRule, WindowMetrics windowMetrics) {
        G.p(splitRule, "$splitRule");
        G.o(windowMetrics, "windowMetrics");
        return splitRule.a(windowMetrics);
    }

    public final <F, S> F f(Pair<F, S> pair) {
        G.p(pair, "<this>");
        return (F) pair.first;
    }

    public final <F, S> S g(Pair<F, S> pair) {
        G.p(pair, "<this>");
        return (S) pair.second;
    }

    public final r h(SplitInfo splitInfo) {
        boolean zIsEmpty;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        G.o(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean zIsEmpty2 = false;
        try {
            zIsEmpty = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            zIsEmpty = false;
        }
        List activities = primaryActivityStack.getActivities();
        G.o(activities, "primaryActivityStack.activities");
        b bVar = new b(activities, zIsEmpty);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        G.o(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            zIsEmpty2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        G.o(activities2, "secondaryActivityStack.activities");
        return new r(bVar, new b(activities2, zIsEmpty2), splitInfo.getSplitRatio());
    }

    @NotNull
    public final List<r> i(@NotNull List<? extends SplitInfo> splitInfoList) {
        G.p(splitInfoList, "splitInfoList");
        List<? extends SplitInfo> list = splitInfoList;
        ArrayList arrayList = new ArrayList(J.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((SplitInfo) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public final Set<EmbeddingRule> j(@NotNull Set<? extends androidx.window.embedding.EmbeddingRule> rules) {
        SplitPairRule splitPairRuleBuild;
        G.p(rules, "rules");
        Set<? extends androidx.window.embedding.EmbeddingRule> set = rules;
        ArrayList arrayList = new ArrayList(J.d0(set, 10));
        for (androidx.window.embedding.EmbeddingRule embeddingRule : set) {
            if (embeddingRule instanceof t) {
                t tVar = (t) embeddingRule;
                splitPairRuleBuild = new SplitPairRule.Builder(m(tVar.f58386h), k(tVar.f58386h), s((v) embeddingRule)).setSplitRatio(tVar.f58391c).setLayoutDirection(tVar.f58392d).setShouldFinishPrimaryWithSecondary(tVar.f58383e).setShouldFinishSecondaryWithPrimary(tVar.f58384f).setShouldClearTop(tVar.f58385g).build();
                G.o(splitPairRuleBuild, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (embeddingRule instanceof u) {
                u uVar = (u) embeddingRule;
                splitPairRuleBuild = new SplitPlaceholderRule.Builder(uVar.f58387e, o(uVar.f58388f), q(uVar.f58388f), s((v) embeddingRule)).setSplitRatio(uVar.f58391c).setLayoutDirection(uVar.f58392d).build();
                G.o(splitPairRuleBuild, "SplitPlaceholderRuleBuil…                 .build()");
            } else {
                if (!(embeddingRule instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                ActivityRule activityRule = (ActivityRule) embeddingRule;
                splitPairRuleBuild = new ActivityRule.Builder(o(activityRule.f120084b), q(activityRule.f120084b)).setShouldAlwaysExpand(activityRule.f120083a).build();
                G.o(splitPairRuleBuild, "ActivityRuleBuilder(\n   …                 .build()");
            }
            arrayList.add((EmbeddingRule) splitPairRuleBuild);
        }
        return U.f6(arrayList);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Intent>> k(@NotNull final Set<s> splitPairFilters) {
        G.p(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: K2.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return h.l(this.f58342a, splitPairFilters, (Pair) obj);
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Activity>> m(@NotNull final Set<s> splitPairFilters) {
        G.p(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: K2.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return h.n(this.f58340a, splitPairFilters, (Pair) obj);
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Activity> o(@NotNull final Set<a> activityFilters) {
        G.p(activityFilters, "activityFilters");
        return new Predicate() { // from class: K2.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return h.p(activityFilters, (Activity) obj);
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Intent> q(@NotNull final Set<a> activityFilters) {
        G.p(activityFilters, "activityFilters");
        return new Predicate() { // from class: K2.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return h.r(activityFilters, (Intent) obj);
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<WindowMetrics> s(@NotNull final v splitRule) {
        G.p(splitRule, "splitRule");
        return new Predicate() { // from class: K2.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return h.t(splitRule, (WindowMetrics) obj);
            }
        };
    }
}
