package kotlin.collections;

import A0.a;
import Oc.g;
import androidx.collection.N0;
import androidx.compose.animation.core.C1610t;
import androidx.compose.runtime.C1922j1;
import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import kotlin.InterfaceC5043v;
import kotlin.L0;
import kotlin.Pair;
import kotlin.jvm.internal.C4956h;
import kotlin.jvm.internal.C4957i;
import kotlin.random.Random;
import kotlin.sequences.C4994g;
import kotlin.sequences.InterfaceC5000m;
import kotlin.text.C5028u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,25882:1\n13275#1,2:25883\n13285#1,2:25885\n1401#1,2:25887\n1409#1,2:25889\n1417#1,2:25891\n1425#1,2:25893\n1433#1,2:25895\n1441#1,2:25897\n1449#1,2:25899\n1457#1,2:25901\n1465#1,2:25903\n2462#1,5:25905\n2475#1,5:25910\n2488#1,5:25915\n2501#1,5:25920\n2514#1,5:25925\n2527#1,5:25930\n2540#1,5:25935\n2553#1,5:25940\n2566#1,5:25945\n4474#1,2:25951\n4485#1,2:25953\n4496#1,2:25955\n4507#1,2:25957\n4518#1,2:25959\n4529#1,2:25961\n4540#1,2:25963\n4551#1,2:25965\n4562#1,2:25967\n4121#1:25969\n14125#1,2:25970\n4122#1,2:25972\n14127#1:25974\n4124#1:25975\n4136#1:25976\n14135#1,2:25977\n4137#1,2:25979\n14137#1:25981\n4139#1:25982\n4151#1:25983\n14145#1,2:25984\n4152#1,2:25986\n14147#1:25988\n4154#1:25989\n4166#1:25990\n14155#1,2:25991\n4167#1,2:25993\n14157#1:25995\n4169#1:25996\n4181#1:25997\n14165#1,2:25998\n4182#1,2:26000\n14167#1:26002\n4184#1:26003\n4196#1:26004\n14175#1,2:26005\n4197#1,2:26007\n14177#1:26009\n4199#1:26010\n4211#1:26011\n14185#1,2:26012\n4212#1,2:26014\n14187#1:26016\n4214#1:26017\n4226#1:26018\n14195#1,2:26019\n4227#1,2:26021\n14197#1:26023\n4229#1:26024\n4241#1:26025\n14205#1,2:26026\n4242#1,2:26028\n14207#1:26030\n4244#1:26031\n14125#1,3:26032\n14135#1,3:26035\n14145#1,3:26038\n14155#1,3:26041\n14165#1,3:26044\n14175#1,3:26047\n14185#1,3:26050\n14195#1,3:26053\n14205#1,3:26056\n4263#1,2:26059\n4375#1,2:26061\n4386#1,2:26063\n4397#1,2:26065\n4408#1,2:26067\n4419#1,2:26069\n4430#1,2:26071\n4441#1,2:26073\n4452#1,2:26075\n4463#1,2:26077\n9664#1,4:26079\n9680#1,4:26083\n9696#1,4:26087\n9712#1,4:26091\n9728#1,4:26095\n9744#1,4:26099\n9760#1,4:26103\n9776#1,4:26107\n9792#1,4:26111\n9359#1,4:26115\n9376#1,4:26119\n9393#1,4:26123\n9410#1,4:26127\n9427#1,4:26131\n9444#1,4:26135\n9461#1,4:26139\n9478#1,4:26143\n9495#1,4:26147\n9512#1,4:26151\n9529#1,4:26155\n9546#1,4:26159\n9563#1,4:26163\n9580#1,4:26167\n9597#1,4:26171\n9614#1,4:26175\n9631#1,4:26179\n9648#1,4:26183\n9961#1,4:26187\n11007#1,5:26191\n11019#1,5:26196\n11031#1,5:26201\n11043#1,5:26206\n11055#1,5:26211\n11067#1,5:26216\n11079#1,5:26221\n11091#1,5:26226\n11103#1,5:26231\n11119#1,5:26236\n11361#1,3:26241\n11364#1,3:26251\n11379#1,3:26254\n11382#1,3:26264\n11397#1,3:26267\n11400#1,3:26277\n11415#1,3:26280\n11418#1,3:26290\n11433#1,3:26293\n11436#1,3:26303\n11451#1,3:26306\n11454#1,3:26316\n11469#1,3:26319\n11472#1,3:26329\n11487#1,3:26332\n11490#1,3:26342\n11505#1,3:26345\n11508#1,3:26355\n11524#1,3:26358\n11527#1,3:26368\n11543#1,3:26371\n11546#1,3:26381\n11562#1,3:26384\n11565#1,3:26394\n11581#1,3:26397\n11584#1,3:26407\n11600#1,3:26410\n11603#1,3:26420\n11619#1,3:26423\n11622#1,3:26433\n11638#1,3:26436\n11641#1,3:26446\n11657#1,3:26449\n11660#1,3:26459\n11676#1,3:26462\n11679#1,3:26472\n12052#1,3:26601\n12063#1,3:26604\n12074#1,3:26607\n12085#1,3:26610\n12096#1,3:26613\n12107#1,3:26616\n12118#1,3:26619\n12129#1,3:26622\n12140#1,3:26625\n11908#1,4:26628\n11922#1,4:26632\n11936#1,4:26636\n11950#1,4:26640\n11964#1,4:26644\n11978#1,4:26648\n11992#1,4:26652\n12006#1,4:26656\n12020#1,4:26660\n11896#1:26664\n14125#1,2:26665\n14127#1:26668\n11897#1:26669\n14125#1,3:26670\n12042#1:26673\n14060#1:26674\n14061#1:26676\n12043#1:26677\n14060#1,2:26678\n14125#1,3:26680\n14135#1,3:26683\n14145#1,3:26686\n14155#1,3:26689\n14165#1,3:26692\n14175#1,3:26695\n14185#1,3:26698\n14195#1,3:26701\n14205#1,3:26704\n22128#1,2:26707\n22130#1,6:26710\n22344#1,2:26716\n22346#1,6:26719\n24467#1,6:26725\n24483#1,6:26731\n24499#1,6:26737\n24515#1,6:26743\n24531#1,6:26749\n24547#1,6:26755\n24563#1,6:26761\n24579#1,6:26767\n24595#1,6:26773\n24701#1,8:26779\n24719#1,8:26787\n24737#1,8:26795\n24755#1,8:26803\n24773#1,8:26811\n24791#1,8:26819\n24809#1,8:26827\n24827#1,8:26835\n24845#1,8:26843\n24943#1,6:26851\n24959#1,6:26857\n24975#1,6:26863\n24991#1,6:26869\n25007#1,6:26875\n25023#1,6:26881\n25039#1,6:26887\n25055#1,6:26893\n1#2:25950\n1#2:26667\n1#2:26675\n1#2:26709\n1#2:26718\n383#3,7:26244\n383#3,7:26257\n383#3,7:26270\n383#3,7:26283\n383#3,7:26296\n383#3,7:26309\n383#3,7:26322\n383#3,7:26335\n383#3,7:26348\n383#3,7:26361\n383#3,7:26374\n383#3,7:26387\n383#3,7:26400\n383#3,7:26413\n383#3,7:26426\n383#3,7:26439\n383#3,7:26452\n383#3,7:26465\n383#3,7:26475\n383#3,7:26482\n383#3,7:26489\n383#3,7:26496\n383#3,7:26503\n383#3,7:26510\n383#3,7:26517\n383#3,7:26524\n383#3,7:26531\n383#3,7:26538\n383#3,7:26545\n383#3,7:26552\n383#3,7:26559\n383#3,7:26566\n383#3,7:26573\n383#3,7:26580\n383#3,7:26587\n383#3,7:26594\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n648#1:25883,2\n657#1:25885,2\n951#1:25887,2\n961#1:25889,2\n971#1:25891,2\n981#1:25893,2\n991#1:25895,2\n1001#1:25897,2\n1011#1:25899,2\n1021#1:25901,2\n1031#1:25903,2\n1041#1:25905,5\n1051#1:25910,5\n1061#1:25915,5\n1071#1:25920,5\n1081#1:25925,5\n1091#1:25930,5\n1101#1:25935,5\n1111#1:25940,5\n1121#1:25945,5\n3938#1:25951,2\n3947#1:25953,2\n3956#1:25955,2\n3965#1:25957,2\n3974#1:25959,2\n3983#1:25961,2\n3992#1:25963,2\n4001#1:25965,2\n4010#1:25967,2\n4021#1:25969\n4021#1:25970,2\n4021#1:25972,2\n4021#1:25974\n4021#1:25975\n4032#1:25976\n4032#1:25977,2\n4032#1:25979,2\n4032#1:25981\n4032#1:25982\n4043#1:25983\n4043#1:25984,2\n4043#1:25986,2\n4043#1:25988\n4043#1:25989\n4054#1:25990\n4054#1:25991,2\n4054#1:25993,2\n4054#1:25995\n4054#1:25996\n4065#1:25997\n4065#1:25998,2\n4065#1:26000,2\n4065#1:26002\n4065#1:26003\n4076#1:26004\n4076#1:26005,2\n4076#1:26007,2\n4076#1:26009\n4076#1:26010\n4087#1:26011\n4087#1:26012,2\n4087#1:26014,2\n4087#1:26016\n4087#1:26017\n4098#1:26018\n4098#1:26019,2\n4098#1:26021,2\n4098#1:26023\n4098#1:26024\n4109#1:26025\n4109#1:26026,2\n4109#1:26028,2\n4109#1:26030\n4109#1:26031\n4121#1:26032,3\n4136#1:26035,3\n4151#1:26038,3\n4166#1:26041,3\n4181#1:26044,3\n4196#1:26047,3\n4211#1:26050,3\n4226#1:26053,3\n4241#1:26056,3\n4253#1:26059,2\n4273#1:26061,2\n4282#1:26063,2\n4291#1:26065,2\n4300#1:26067,2\n4309#1:26069,2\n4318#1:26071,2\n4327#1:26073,2\n4336#1:26075,2\n4345#1:26077,2\n8964#1:26079,4\n8979#1:26083,4\n8994#1:26087,4\n9009#1:26091,4\n9024#1:26095,4\n9039#1:26099,4\n9054#1:26103,4\n9069#1:26107,4\n9084#1:26111,4\n9099#1:26115,4\n9114#1:26119,4\n9129#1:26123,4\n9144#1:26127,4\n9159#1:26131,4\n9174#1:26135,4\n9189#1:26139,4\n9204#1:26143,4\n9219#1:26147,4\n9233#1:26151,4\n9247#1:26155,4\n9261#1:26159,4\n9275#1:26163,4\n9289#1:26167,4\n9303#1:26171,4\n9317#1:26175,4\n9331#1:26179,4\n9345#1:26183,4\n9811#1:26187,4\n10574#1:26191,5\n10583#1:26196,5\n10592#1:26201,5\n10601#1:26206,5\n10610#1:26211,5\n10619#1:26216,5\n10628#1:26221,5\n10637#1:26226,5\n10646#1:26231,5\n10659#1:26236,5\n11135#1:26241,3\n11135#1:26251,3\n11147#1:26254,3\n11147#1:26264,3\n11159#1:26267,3\n11159#1:26277,3\n11171#1:26280,3\n11171#1:26290,3\n11183#1:26293,3\n11183#1:26303,3\n11195#1:26306,3\n11195#1:26316,3\n11207#1:26319,3\n11207#1:26329,3\n11219#1:26332,3\n11219#1:26342,3\n11231#1:26345,3\n11231#1:26355,3\n11244#1:26358,3\n11244#1:26368,3\n11257#1:26371,3\n11257#1:26381,3\n11270#1:26384,3\n11270#1:26394,3\n11283#1:26397,3\n11283#1:26407,3\n11296#1:26410,3\n11296#1:26420,3\n11309#1:26423,3\n11309#1:26433,3\n11322#1:26436,3\n11322#1:26446,3\n11335#1:26449,3\n11335#1:26459,3\n11348#1:26462,3\n11348#1:26472,3\n11705#1:26601,3\n11715#1:26604,3\n11725#1:26607,3\n11735#1:26610,3\n11745#1:26613,3\n11755#1:26616,3\n11765#1:26619,3\n11775#1:26622,3\n11785#1:26625,3\n11795#1:26628,4\n11805#1:26632,4\n11815#1:26636,4\n11825#1:26640,4\n11835#1:26644,4\n11845#1:26648,4\n11855#1:26652,4\n11865#1:26656,4\n11875#1:26660,4\n11885#1:26664\n11885#1:26665,2\n11885#1:26668\n11885#1:26669\n11896#1:26670,3\n12033#1:26673\n12033#1:26674\n12033#1:26676\n12033#1:26677\n12042#1:26678,2\n20414#1:26680,3\n20426#1:26683,3\n20438#1:26686,3\n20450#1:26689,3\n20462#1:26692,3\n20474#1:26695,3\n20486#1:26698,3\n20498#1:26701,3\n20510#1:26704,3\n22958#1:26707,2\n22958#1:26710,6\n23111#1:26716,2\n23111#1:26719,6\n24376#1:26725,6\n24386#1:26731,6\n24396#1:26737,6\n24406#1:26743,6\n24416#1:26749,6\n24426#1:26755,6\n24436#1:26761,6\n24446#1:26767,6\n24456#1:26773,6\n24610#1:26779,8\n24620#1:26787,8\n24630#1:26795,8\n24640#1:26803,8\n24650#1:26811,8\n24660#1:26819,8\n24670#1:26827,8\n24680#1:26835,8\n24690#1:26843,8\n24862#1:26851,6\n24872#1:26857,6\n24882#1:26863,6\n24892#1:26869,6\n24902#1:26875,6\n24912#1:26881,6\n24922#1:26887,6\n24932#1:26893,6\n11885#1:26667\n12033#1:26675\n22958#1:26709\n23111#1:26718\n11135#1:26244,7\n11147#1:26257,7\n11159#1:26270,7\n11171#1:26283,7\n11183#1:26296,7\n11195#1:26309,7\n11207#1:26322,7\n11219#1:26335,7\n11231#1:26348,7\n11244#1:26361,7\n11257#1:26374,7\n11270#1:26387,7\n11283#1:26400,7\n11296#1:26413,7\n11309#1:26426,7\n11322#1:26439,7\n11335#1:26452,7\n11348#1:26465,7\n11363#1:26475,7\n11381#1:26482,7\n11399#1:26489,7\n11417#1:26496,7\n11435#1:26503,7\n11453#1:26510,7\n11471#1:26517,7\n11489#1:26524,7\n11507#1:26531,7\n11526#1:26538,7\n11545#1:26545,7\n11564#1:26552,7\n11583#1:26559,7\n11602#1:26566,7\n11621#1:26573,7\n11640#1:26580,7\n11659#1:26587,7\n11678#1:26594,7\n*E\n"})
public class B extends C4875q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25425#2:71\n*E\n"})
    public static final class a<T> implements Iterable<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f217485a;

        public a(Object[] objArr) {
            this.f217485a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C4956h.a(this.f217485a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25433#2:71\n*E\n"})
    public static final class b implements Iterable<Byte>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f217486a;

        public b(byte[] bArr) {
            this.f217486a = bArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Byte> iterator() {
            return C4957i.b(this.f217486a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25441#2:71\n*E\n"})
    public static final class c implements Iterable<Short>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ short[] f217487a;

        public c(short[] sArr) {
            this.f217487a = sArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Short> iterator() {
            return C4957i.h(this.f217487a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25449#2:71\n*E\n"})
    public static final class d implements Iterable<Integer>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f217488a;

        public d(int[] iArr) {
            this.f217488a = iArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Integer> iterator() {
            return C4957i.f(this.f217488a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25457#2:71\n*E\n"})
    public static final class e implements Iterable<Long>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long[] f217489a;

        public e(long[] jArr) {
            this.f217489a = jArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Long> iterator() {
            return C4957i.g(this.f217489a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25465#2:71\n*E\n"})
    public static final class f implements Iterable<Float>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float[] f217490a;

        public f(float[] fArr) {
            this.f217490a = fArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Float> iterator() {
            return C4957i.e(this.f217490a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25473#2:71\n*E\n"})
    public static final class g implements Iterable<Double>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ double[] f217491a;

        public g(double[] dArr) {
            this.f217491a = dArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Double> iterator() {
            return C4957i.d(this.f217491a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25481#2:71\n*E\n"})
    public static final class h implements Iterable<Boolean>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f217492a;

        public h(boolean[] zArr) {
            this.f217492a = zArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Boolean> iterator() {
            return C4957i.a(this.f217492a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25489#2:71\n*E\n"})
    public static final class i implements Iterable<Character>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ char[] f217493a;

        public i(char[] cArr) {
            this.f217493a = cArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return C4957i.c(this.f217493a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,730:1\n25499#2:731\n*E\n"})
    public static final class j<T> implements InterfaceC5000m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f217494a;

        public j(Object[] objArr) {
            this.f217494a = objArr;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<T> iterator() {
            return C4956h.a(this.f217494a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,730:1\n25509#2:731\n*E\n"})
    public static final class k implements InterfaceC5000m<Byte> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f217495a;

        public k(byte[] bArr) {
            this.f217495a = bArr;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Byte> iterator() {
            return C4957i.b(this.f217495a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,730:1\n25519#2:731\n*E\n"})
    public static final class l implements InterfaceC5000m<Short> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ short[] f217496a;

        public l(short[] sArr) {
            this.f217496a = sArr;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Short> iterator() {
            return C4957i.h(this.f217496a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,730:1\n25529#2:731\n*E\n"})
    public static final class m implements InterfaceC5000m<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f217497a;

        public m(int[] iArr) {
            this.f217497a = iArr;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Integer> iterator() {
            return C4957i.f(this.f217497a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,730:1\n25539#2:731\n*E\n"})
    public static final class n implements InterfaceC5000m<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long[] f217498a;

        public n(long[] jArr) {
            this.f217498a = jArr;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Long> iterator() {
            return C4957i.g(this.f217498a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,730:1\n25549#2:731\n*E\n"})
    public static final class o implements InterfaceC5000m<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float[] f217499a;

        public o(float[] fArr) {
            this.f217499a = fArr;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Float> iterator() {
            return C4957i.e(this.f217499a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,730:1\n25559#2:731\n*E\n"})
    public static final class p implements InterfaceC5000m<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ double[] f217500a;

        public p(double[] dArr) {
            this.f217500a = dArr;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Double> iterator() {
            return C4957i.d(this.f217500a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,730:1\n25569#2:731\n*E\n"})
    public static final class q implements InterfaceC5000m<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f217501a;

        public q(boolean[] zArr) {
            this.f217501a = zArr;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Boolean> iterator() {
            return C4957i.a(this.f217501a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,730:1\n25579#2:731\n*E\n"})
    public static final class r implements InterfaceC5000m<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ char[] f217502a;

        public r(char[] cArr) {
            this.f217502a = cArr;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Character> iterator() {
            return C4957i.c(this.f217502a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    @kotlin.jvm.internal.V({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt$groupingBy$1\n*L\n1#1,25882:1\n*E\n"})
    public static final class s<K, T> implements Y<T, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T[] f217503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, K> f217504b;

        /* JADX WARN: Multi-variable type inference failed */
        public s(T[] tArr, ed.l<? super T, ? extends K> lVar) {
            this.f217503a = tArr;
            this.f217504b = lVar;
        }

        @Override // kotlin.collections.Y
        public K a(T t10) {
            return this.f217504b.invoke(t10);
        }

        @Override // kotlin.collections.Y
        public Iterator<T> b() {
            return C4956h.a(this.f217503a);
        }
    }

    public static boolean A5(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M A6(@NotNull char[] cArr, @NotNull M destination, @NotNull ed.l<? super Character, ? extends K> keySelector, @NotNull ed.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (char c10 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c10)), valueTransform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @dd.j(name = "averageOfLong")
    public static final double A7(@NotNull Long[] lArr) {
        kotlin.jvm.internal.G.p(lArr, "<this>");
        double dLongValue = 0.0d;
        int i10 = 0;
        for (Long l10 : lArr) {
            dLongValue += l10.longValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i10);
    }

    public static boolean A8(@NotNull long[] jArr, long j10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return ag(jArr, j10) >= 0;
    }

    @NotNull
    public static final List<Float> A9(@NotNull float[] fArr, int i10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = fArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return ay(fArr, length);
    }

    @NotNull
    public static final <R> List<Pair<Double, R>> AA(@NotNull double[] dArr, @NotNull R[] other) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            double d10 = dArr[i10];
            arrayList.add(new Pair(Double.valueOf(d10), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> Aa(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Integer>> C Ab(@NotNull int[] iArr, @NotNull C destination, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                destination.add(Integer.valueOf(i10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Float Ac(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
        }
        return null;
    }

    public static final <R> R Ad(@NotNull float[] fArr, R r10, @NotNull ed.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (float f10 : fArr) {
            r10 = operation.invoke(r10, Float.valueOf(f10));
        }
        return r10;
    }

    @NotNull
    public static final md.l Ae(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return new md.l(0, cArr.length - 1, 1);
    }

    @NotNull
    public static final <K> Map<K, List<Boolean>> Af(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(Boolean.valueOf(z10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Integer> Ag(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Integer> setUz = uz(iArr);
        N.T0(setUz, other);
        return setUz;
    }

    public static /* synthetic */ String Ah(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return rh(dArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @NotNull
    public static final <R> List<R> Ai(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(transform.invoke(Byte.valueOf(b10)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> float Aj(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f10 = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Float.valueOf(f10));
            if (1 <= length) {
                while (true) {
                    float f11 = fArr[i10];
                    R rInvoke2 = selector.invoke(Float.valueOf(f11));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        f10 = f11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return f10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Ak(char[] cArr, ed.l<? super Character, Float> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(cArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Long Al(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) < 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Am(int[] iArr, ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T An(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                T t11 = tArr[i10];
                if (t10.compareTo(t11) > 0) {
                    t10 = t11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    public static final boolean Ao(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Character Ap(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return Bp(cArr, Random.f218007a);
    }

    public static final double Aq(@NotNull double[] dArr, @NotNull ed.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = dArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            dDoubleValue = operation.invoke(Double.valueOf(dArr[i11]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void Ar(@NotNull boolean[] zArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        AbstractC4859d.f217603a.d(i10, i11, zArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[i13];
            zArr[i13] = z10;
            i13--;
            i10++;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> As(@NotNull T[] tArr, @NotNull ed.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (tArr.length == 0) {
            return EmptyList.f217510a;
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sInvoke = operation.invoke(Integer.valueOf(i10), sInvoke, (Object) tArr[i10]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    public static final <T> T At(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static long[] Au(@NotNull long[] jArr, @NotNull Collection<Integer> indices) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr2[i10] = jArr[it.next().intValue()];
            i10++;
        }
        return jArr2;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> Av(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return aw(cArr, new g.a(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final int Aw(@NotNull float[] fArr, @NotNull ed.l<? super Float, Integer> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (float f10 : fArr) {
            iIntValue += selector.invoke(Float.valueOf(f10)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final int Ax(int[] iArr, ed.l<? super Integer, kotlin.x0> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += selector.invoke(Integer.valueOf(i11)).f218498a;
        }
        return i10;
    }

    @NotNull
    public static final byte[] Ay(@NotNull Byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = bArr[i10].byteValue();
        }
        return bArr2;
    }

    @NotNull
    public static final Set<Character> Az(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return EmptySet.f217512a;
        }
        if (length == 1) {
            return x0.f(Character.valueOf(cArr[0]));
        }
        int length2 = cArr.length;
        if (length2 > 128) {
            length2 = 128;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(length2));
        Dy(cArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final boolean B5(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, ? super Double>> M B6(@NotNull double[] dArr, @NotNull M destination, @NotNull ed.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (double d10 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d10)), Double.valueOf(d10));
        }
        return destination;
    }

    @dd.j(name = "averageOfShort")
    public static final double B7(@NotNull Short[] shArr) {
        kotlin.jvm.internal.G.p(shArr, "<this>");
        double dShortValue = 0.0d;
        int i10 = 0;
        for (Short sh : shArr) {
            dShortValue += (double) sh.shortValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i10);
    }

    public static <T> boolean B8(@NotNull T[] tArr, T t10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return bg(tArr, t10) >= 0;
    }

    @NotNull
    public static final List<Integer> B9(@NotNull int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = iArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return cy(iArr, length);
    }

    @NotNull
    public static final <R, V> List<V> BA(@NotNull double[] dArr, @NotNull R[] other, @NotNull ed.p<? super Double, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> Ba(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Long>> C Bb(@NotNull long[] jArr, @NotNull C destination, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Integer Bc(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final <R> R Bd(@NotNull int[] iArr, R r10, @NotNull ed.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, Integer.valueOf(i10));
        }
        return r10;
    }

    @NotNull
    public static final md.l Be(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return new md.l(0, dArr.length - 1, 1);
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> Bf(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends K> keySelector, @NotNull ed.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Long> Bg(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Long> setVz = vz(jArr);
        N.T0(setVz, other);
        return setVz;
    }

    public static /* synthetic */ String Bh(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return sh(fArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @NotNull
    public static final <R> List<R> Bi(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(transform.invoke(Character.valueOf(c10)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> int Bj(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Integer.valueOf(i10));
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        i10 = i12;
                        rInvoke = rInvoke2;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Bk(double[] dArr, ed.l<? super Double, Float> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Double.valueOf(dArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T> T Bl(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                T t11 = tArr[i10];
                if (comparator.compare(t10, t11) < 0) {
                    t10 = t11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Bm(long[] jArr, ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double Bn(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMin = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dMin = Math.min(dMin, dArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dMin);
    }

    public static final boolean Bo(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character Bp(@NotNull char[] cArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.q(cArr.length)]);
    }

    public static final float Bq(@NotNull float[] fArr, @NotNull ed.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = fArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            fFloatValue = operation.invoke(Float.valueOf(fArr[i11]), Float.valueOf(fFloatValue)).floatValue();
        }
        return fFloatValue;
    }

    @NotNull
    public static final List<Byte> Br(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<Byte> listHz = hz(bArr);
        Collections.reverse(listHz);
        return listHz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Short> Bs(short[] sArr, ed.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (sArr.length == 0) {
            return EmptyList.f217510a;
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    public static final <T> T Bt(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static long[] Bu(@NotNull long[] jArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? new long[0] : C4875q.k1(jArr, indices.f221139a, indices.f221140b + 1);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> Bv(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return bw(dArr, new g.a(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final int Bw(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Integer> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (int i10 : iArr) {
            iIntValue += selector.invoke(Integer.valueOf(i10)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final int Bx(long[] jArr, ed.l<? super Long, kotlin.x0> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int i10 = 0;
        for (long j10 : jArr) {
            i10 += selector.invoke(Long.valueOf(j10)).f218498a;
        }
        return i10;
    }

    @NotNull
    public static final char[] By(@NotNull Character[] chArr) {
        kotlin.jvm.internal.G.p(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = chArr[i10].charValue();
        }
        return cArr;
    }

    @NotNull
    public static final Set<Double> Bz(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return EmptySet.f217512a;
        }
        if (length == 1) {
            return x0.f(Double.valueOf(dArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(dArr.length));
        Ey(dArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final boolean C5(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M C6(@NotNull double[] dArr, @NotNull M destination, @NotNull ed.l<? super Double, ? extends K> keySelector, @NotNull ed.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (double d10 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d10)), valueTransform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @Xc.f
    public static final byte C7(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr[0];
    }

    public static boolean C8(@NotNull short[] sArr, short s10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return cg(sArr, s10) >= 0;
    }

    @NotNull
    public static final List<Long> C9(@NotNull long[] jArr, int i10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = jArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return dy(jArr, length);
    }

    @NotNull
    public static final <R> List<Pair<Float, R>> CA(@NotNull float[] fArr, @NotNull Iterable<? extends R> other) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(Float.valueOf(fArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> Ca(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <T, C extends Collection<? super T>> C Cb(@NotNull T[] tArr, @NotNull C destination, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @Nullable
    public static final Integer Cc(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    public static final <R> R Cd(@NotNull long[] jArr, R r10, @NotNull ed.p<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, Long.valueOf(j10));
        }
        return r10;
    }

    @NotNull
    public static final md.l Ce(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return new md.l(0, fArr.length - 1, 1);
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, List<Byte>>> M Cf(@NotNull byte[] bArr, @NotNull M destination, @NotNull ed.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(Byte.valueOf(b10));
        }
        return destination;
    }

    @NotNull
    public static final <T> Set<T> Cg(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Collection collectionV0 = N.v0(other);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t10 : tArr) {
            if (collectionV0.contains(t10)) {
                linkedHashSet.add(t10);
            }
        }
        return linkedHashSet;
    }

    public static /* synthetic */ String Ch(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return th(iArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @NotNull
    public static final <R> List<R> Ci(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends R> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(transform.invoke(Double.valueOf(d10)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> long Cj(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Long.valueOf(j10));
            if (1 <= length) {
                while (true) {
                    long j11 = jArr[i10];
                    R rInvoke2 = selector.invoke(Long.valueOf(j11));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        j10 = j11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return j10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Ck(float[] fArr, ed.l<? super Float, Float> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Float.valueOf(fArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Short Cl(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) < 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R extends Comparable<? super R>> R Cm(T[] tArr, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double Cn(@NotNull Double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, dArr[i10].doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final boolean Co(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double Cp(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return Dp(dArr, Random.f218007a);
    }

    public static final int Cq(@NotNull int[] iArr, @NotNull ed.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = iArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            iIntValue = operation.invoke(Integer.valueOf(iArr[i11]), Integer.valueOf(iIntValue)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final List<Character> Cr(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<Character> listIz = iz(cArr);
        Collections.reverse(listIz);
        return listIz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Boolean> Cs(boolean[] zArr, ed.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (zArr.length == 0) {
            return EmptyList.f217510a;
        }
        boolean z10 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z10));
        int length = zArr.length;
        int i10 = 1;
        while (i10 < length) {
            Boolean boolInvoke = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(z10), Boolean.valueOf(zArr[i10]));
            boolean zBooleanValue = boolInvoke.booleanValue();
            arrayList.add(boolInvoke);
            i10++;
            z10 = zBooleanValue;
        }
        return arrayList;
    }

    public static short Ct(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final <T> T[] Cu(@NotNull T[] tArr, @NotNull Collection<Integer> indices) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        T[] tArr2 = (T[]) C4873o.a(tArr, indices.size());
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            tArr2[i10] = tArr[it.next().intValue()];
            i10++;
        }
        return tArr2;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> Cv(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return cw(fArr, new g.a(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final int Cw(@NotNull long[] jArr, @NotNull ed.l<? super Long, Integer> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (long j10 : jArr) {
            iIntValue += selector.invoke(Long.valueOf(j10)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final <T> int Cx(T[] tArr, ed.l<? super T, kotlin.x0> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int i10 = 0;
        for (T t10 : tArr) {
            i10 += selector.invoke(t10).f218498a;
        }
        return i10;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Byte>> C Cy(@NotNull byte[] bArr, @NotNull C destination) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (byte b10 : bArr) {
            destination.add(Byte.valueOf(b10));
        }
        return destination;
    }

    @NotNull
    public static final Set<Float> Cz(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return EmptySet.f217512a;
        }
        if (length == 1) {
            return x0.f(Float.valueOf(fArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(fArr.length));
        Fy(fArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final boolean D5(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, ? super Float>> M D6(@NotNull float[] fArr, @NotNull M destination, @NotNull ed.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (float f10 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f10)), Float.valueOf(f10));
        }
        return destination;
    }

    @Xc.f
    public static final char D7(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr[0];
    }

    public static final boolean D8(@NotNull boolean[] zArr, boolean z10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return dg(zArr, z10) >= 0;
    }

    @NotNull
    public static <T> List<T> D9(@NotNull T[] tArr, int i10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = tArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return ey(tArr, length);
    }

    @NotNull
    public static final <R, V> List<V> DA(@NotNull float[] fArr, @NotNull Iterable<? extends R> other, @NotNull ed.p<? super Float, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> Da(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Short>> C Db(@NotNull short[] sArr, @NotNull C destination, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                destination.add(Short.valueOf(s10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Long Dc(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Dd(@NotNull T[] tArr, R r10, @NotNull ed.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (a.b bVar : tArr) {
            r10 = operation.invoke(r10, bVar);
        }
        return r10;
    }

    @NotNull
    public static md.l De(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return new md.l(0, iArr.length - 1, 1);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Df(@NotNull byte[] bArr, @NotNull M destination, @NotNull ed.l<? super Byte, ? extends K> keySelector, @NotNull ed.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @NotNull
    public static final Set<Short> Dg(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Short> setXz = xz(sArr);
        N.T0(setXz, other);
        return setXz;
    }

    public static /* synthetic */ String Dh(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return uh(jArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @NotNull
    public static final <R> List<R> Di(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends R> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(transform.invoke(Float.valueOf(f10)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T Dj(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(t10);
            if (1 <= length) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Dk(int[] iArr, ed.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Integer.valueOf(iArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final byte Dl(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) < 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Dm(short[] sArr, ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float Dn(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fMin);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final byte[] Do(byte[] bArr, ed.l<? super Byte, L0> action) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (byte b10 : bArr) {
            action.invoke(Byte.valueOf(b10));
        }
        return bArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double Dp(@NotNull double[] dArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.q(dArr.length)]);
    }

    public static final long Dq(@NotNull long[] jArr, @NotNull ed.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = jArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            jLongValue = operation.invoke(Long.valueOf(jArr[i11]), Long.valueOf(jLongValue)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Double> Dr(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<Double> listJz = jz(dArr);
        Collections.reverse(listJz);
        return listJz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Ds(byte[] bArr, R r10, ed.p<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (bArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, Byte.valueOf(b10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final short Dt(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Short shValueOf = null;
        boolean z10 = false;
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                shValueOf = Short.valueOf(s10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.G.n(shValueOf, "null cannot be cast to non-null type kotlin.Short");
        return shValueOf.shortValue();
    }

    @NotNull
    public static final <T> T[] Du(@NotNull T[] tArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? (T[]) C4875q.l1(tArr, 0, 0) : (T[]) C4875q.l1(tArr, indices.f221139a, indices.f221140b + 1);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> Dv(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return dw(iArr, new g.a(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final <T> int Dw(@NotNull T[] tArr, @NotNull ed.l<? super T, Integer> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (T t10 : tArr) {
            iIntValue += selector.invoke(t10).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final int Dx(short[] sArr, ed.l<? super Short, kotlin.x0> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int i10 = 0;
        for (short s10 : sArr) {
            i10 += selector.invoke(Short.valueOf(s10)).f218498a;
        }
        return i10;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Character>> C Dy(@NotNull char[] cArr, @NotNull C destination) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (char c10 : cArr) {
            destination.add(Character.valueOf(c10));
        }
        return destination;
    }

    @NotNull
    public static final Set<Integer> Dz(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return EmptySet.f217512a;
        }
        if (length == 1) {
            return x0.f(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(iArr.length));
        Gy(iArr, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static Iterable<Byte> E5(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr.length == 0 ? EmptyList.f217510a : new b(bArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M E6(@NotNull float[] fArr, @NotNull M destination, @NotNull ed.l<? super Float, ? extends K> keySelector, @NotNull ed.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (float f10 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f10)), valueTransform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @Xc.f
    public static final double E7(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr[0];
    }

    @InterfaceC4887e0(version = "2.2")
    @InterfaceC5043v
    @Xc.f
    public static final byte[] E8(byte[] bArr, int i10, ed.l<? super Integer, Byte> init) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(...)");
        for (int length = bArr.length; length < i10; length++) {
            bArrCopyOf[length] = init.invoke(Integer.valueOf(length)).byteValue();
        }
        return bArrCopyOf;
    }

    @NotNull
    public static final List<Short> E9(@NotNull short[] sArr, int i10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = sArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return fy(sArr, length);
    }

    @NotNull
    public static final List<Pair<Float, Float>> EA(@NotNull float[] fArr, @NotNull float[] other) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(Float.valueOf(fArr[i10]), Float.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> Ea(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Boolean>> C Eb(@NotNull boolean[] zArr, @NotNull C destination, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Long Ec(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
        }
        return null;
    }

    public static final <R> R Ed(@NotNull short[] sArr, R r10, @NotNull ed.p<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, Short.valueOf(s10));
        }
        return r10;
    }

    @NotNull
    public static md.l Ee(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return new md.l(0, jArr.length - 1, 1);
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M Ef(@NotNull char[] cArr, @NotNull M destination, @NotNull ed.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(Character.valueOf(c10));
        }
        return destination;
    }

    @NotNull
    public static final Set<Boolean> Eg(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Boolean> setYz = yz(zArr);
        N.T0(setYz, other);
        return setYz;
    }

    public static /* synthetic */ String Eh(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return vh(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @NotNull
    public static final <R> List<R> Ei(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(transform.invoke(Integer.valueOf(i10)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> short Ej(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Short.valueOf(s10));
            if (1 <= length) {
                while (true) {
                    short s11 = sArr[i10];
                    R rInvoke2 = selector.invoke(Short.valueOf(s11));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        s10 = s11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return s10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Ek(long[] jArr, ed.l<? super Long, Float> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Long.valueOf(jArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final char El(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) < 0) {
                    c10 = c11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return c10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Em(boolean[] zArr, ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float En(@NotNull Float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, fArr[i10].floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final char[] Eo(char[] cArr, ed.l<? super Character, L0> action) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (char c10 : cArr) {
            action.invoke(Character.valueOf(c10));
        }
        return cArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Ep(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return Fp(fArr, Random.f218007a);
    }

    public static final <S, T extends S> S Eq(@NotNull T[] tArr, @NotNull ed.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = tArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            sInvoke = operation.invoke((Object) tArr[i11], sInvoke);
        }
        return sInvoke;
    }

    @NotNull
    public static final List<Float> Er(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<Float> listKz = kz(fArr);
        Collections.reverse(listKz);
        return listKz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Es(char[] cArr, R r10, ed.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (cArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        for (char c10 : cArr) {
            r10 = operation.invoke(r10, Character.valueOf(c10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final boolean Et(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static short[] Eu(@NotNull short[] sArr, @NotNull Collection<Integer> indices) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            sArr2[i10] = sArr[it.next().intValue()];
            i10++;
        }
        return sArr2;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> Ev(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return ew(jArr, new g.a(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final int Ew(@NotNull short[] sArr, @NotNull ed.l<? super Short, Integer> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (short s10 : sArr) {
            iIntValue += selector.invoke(Short.valueOf(s10)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final int Ex(boolean[] zArr, ed.l<? super Boolean, kotlin.x0> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int i10 = 0;
        for (boolean z10 : zArr) {
            i10 += selector.invoke(Boolean.valueOf(z10)).f218498a;
        }
        return i10;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Double>> C Ey(@NotNull double[] dArr, @NotNull C destination) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (double d10 : dArr) {
            destination.add(Double.valueOf(d10));
        }
        return destination;
    }

    @NotNull
    public static final Set<Long> Ez(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return EmptySet.f217512a;
        }
        if (length == 1) {
            return x0.f(Long.valueOf(jArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(jArr.length));
        Hy(jArr, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static Iterable<Character> F5(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr.length == 0 ? EmptyList.f217510a : new i(cArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, ? super Integer>> M F6(@NotNull int[] iArr, @NotNull M destination, @NotNull ed.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (int i10 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i10)), Integer.valueOf(i10));
        }
        return destination;
    }

    @Xc.f
    public static final float F7(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr[0];
    }

    @InterfaceC4887e0(version = "2.2")
    @InterfaceC5043v
    @Xc.f
    public static final char[] F8(char[] cArr, int i10, ed.l<? super Integer, Character> init) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        kotlin.jvm.internal.G.o(cArrCopyOf, "copyOf(...)");
        for (int length = cArr.length; length < i10; length++) {
            cArrCopyOf[length] = init.invoke(Integer.valueOf(length)).charValue();
        }
        return cArrCopyOf;
    }

    @NotNull
    public static final List<Boolean> F9(@NotNull boolean[] zArr, int i10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = zArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return gy(zArr, length);
    }

    @NotNull
    public static final <V> List<V> FA(@NotNull float[] fArr, @NotNull float[] other, @NotNull ed.p<? super Float, ? super Float, ? extends V> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), Float.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> Fa(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @Xc.f
    public static final Boolean Fb(boolean[] zArr, ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    @Nullable
    public static <T> T Fc(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final <R> R Fd(@NotNull boolean[] zArr, R r10, @NotNull ed.p<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (boolean z10 : zArr) {
            r10 = operation.invoke(r10, Boolean.valueOf(z10));
        }
        return r10;
    }

    @NotNull
    public static <T> md.l Fe(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return new md.l(0, tArr.length - 1, 1);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Ff(@NotNull char[] cArr, @NotNull M destination, @NotNull ed.l<? super Character, ? extends K> keySelector, @NotNull ed.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Fg(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr.length == 0;
    }

    public static /* synthetic */ String Fh(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return wh(sArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @NotNull
    public static final <R> List<R> Fi(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends R> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(transform.invoke(Long.valueOf(j10)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> boolean Fj(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z10 = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Boolean.valueOf(z10));
            if (1 <= length) {
                while (true) {
                    boolean z11 = zArr[i10];
                    R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        z10 = z11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return z10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> Float Fk(T[] tArr, ed.l<? super T, Float> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(tArr[i10]).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final double Fl(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d10 = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                double d11 = dArr[i10];
                if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) < 0) {
                    d10 = d11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return d10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Fm(byte[] bArr, ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static Integer Fn(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double[] Fo(double[] dArr, ed.l<? super Double, L0> action) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (double d10 : dArr) {
            action.invoke(Double.valueOf(d10));
        }
        return dArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float Fp(@NotNull float[] fArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.q(fArr.length)]);
    }

    public static final short Fq(@NotNull short[] sArr, @NotNull ed.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = sArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            sShortValue = operation.invoke(Short.valueOf(sArr[i11]), Short.valueOf(sShortValue)).shortValue();
        }
        return sShortValue;
    }

    @NotNull
    public static final List<Integer> Fr(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<Integer> listLz = lz(iArr);
        Collections.reverse(listLz);
        return listLz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Fs(double[] dArr, R r10, ed.p<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (dArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        for (double d10 : dArr) {
            r10 = operation.invoke(r10, Double.valueOf(d10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final boolean Ft(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Boolean boolValueOf = null;
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                boolValueOf = Boolean.valueOf(z11);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.G.n(boolValueOf, "null cannot be cast to non-null type kotlin.Boolean");
        return boolValueOf.booleanValue();
    }

    @NotNull
    public static short[] Fu(@NotNull short[] sArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? new short[0] : C4875q.m1(sArr, indices.f221139a, indices.f221140b + 1);
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> Fv(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return fw(tArr, new g.a(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final int Fw(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Integer> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (boolean z10 : zArr) {
            iIntValue += selector.invoke(Boolean.valueOf(z10)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final long Fx(byte[] bArr, ed.l<? super Byte, kotlin.B0> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long j10 = 0;
        for (byte b10 : bArr) {
            j10 += selector.invoke(Byte.valueOf(b10)).f217440a;
        }
        return j10;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Float>> C Fy(@NotNull float[] fArr, @NotNull C destination) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (float f10 : fArr) {
            destination.add(Float.valueOf(f10));
        }
        return destination;
    }

    @NotNull
    public static <T> Set<T> Fz(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return EmptySet.f217512a;
        }
        if (length == 1) {
            return x0.f(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(tArr.length));
        Iy(tArr, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static Iterable<Double> G5(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr.length == 0 ? EmptyList.f217510a : new g(dArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M G6(@NotNull int[] iArr, @NotNull M destination, @NotNull ed.l<? super Integer, ? extends K> keySelector, @NotNull ed.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (int i10 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i10)), valueTransform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @Xc.f
    public static final int G7(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr[0];
    }

    @InterfaceC4887e0(version = "2.2")
    @InterfaceC5043v
    @Xc.f
    public static final double[] G8(double[] dArr, int i10, ed.l<? super Integer, Double> init) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
        kotlin.jvm.internal.G.o(dArrCopyOf, "copyOf(...)");
        for (int length = dArr.length; length < i10; length++) {
            dArrCopyOf[length] = init.invoke(Integer.valueOf(length)).doubleValue();
        }
        return dArrCopyOf;
    }

    @NotNull
    public static final List<Byte> G9(@NotNull byte[] bArr, int i10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = bArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Ox(bArr, length);
    }

    @NotNull
    public static final <R> List<Pair<Float, R>> GA(@NotNull float[] fArr, @NotNull R[] other) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            float f10 = fArr[i10];
            arrayList.add(new Pair(Float.valueOf(f10), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> Ga(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    @Xc.f
    public static final Byte Gb(byte[] bArr, ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
        }
        return null;
    }

    @Nullable
    public static final <T> T Gc(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    public static final <R> R Gd(@NotNull byte[] bArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    @NotNull
    public static md.l Ge(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return new md.l(0, sArr.length - 1, 1);
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, List<Double>>> M Gf(@NotNull double[] dArr, @NotNull M destination, @NotNull ed.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(Double.valueOf(d10));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Gg(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr.length == 0;
    }

    public static /* synthetic */ String Gh(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return xh(zArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @NotNull
    public static final <T, R> List<R> Gi(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(transform.invoke(t10));
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double Gj(byte[] bArr, ed.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Byte.valueOf(bArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Gk(short[] sArr, ed.l<? super Short, Float> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Short.valueOf(sArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final float Gl(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f10 = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                float f11 = fArr[i10];
                if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) < 0) {
                    f10 = f11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return f10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Gm(char[] cArr, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Long Gn(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (j10 > j11) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float[] Go(float[] fArr, ed.l<? super Float, L0> action) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (float f10 : fArr) {
            action.invoke(Float.valueOf(f10));
        }
        return fArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Integer Gp(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return Hp(iArr, Random.f218007a);
    }

    public static final boolean Gq(@NotNull boolean[] zArr, @NotNull ed.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = zArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zArr[i11]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return zBooleanValue;
    }

    @NotNull
    public static final List<Long> Gr(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<Long> listMz = mz(jArr);
        Collections.reverse(listMz);
        return listMz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Gs(float[] fArr, R r10, ed.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (fArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        for (float f10 : fArr) {
            r10 = operation.invoke(r10, Float.valueOf(f10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean Gt(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    @NotNull
    public static final boolean[] Gu(@NotNull boolean[] zArr, @NotNull Collection<Integer> indices) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr2[i10] = zArr[it.next().intValue()];
            i10++;
        }
        return zArr2;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> Gv(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return gw(sArr, new g.a(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final double Gw(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b10 : bArr) {
            dDoubleValue += selector.invoke(Byte.valueOf(b10)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final long Gx(char[] cArr, ed.l<? super Character, kotlin.B0> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long j10 = 0;
        for (char c10 : cArr) {
            j10 += selector.invoke(Character.valueOf(c10)).f217440a;
        }
        return j10;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Integer>> C Gy(@NotNull int[] iArr, @NotNull C destination) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (int i10 : iArr) {
            destination.add(Integer.valueOf(i10));
        }
        return destination;
    }

    @NotNull
    public static final Set<Short> Gz(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return EmptySet.f217512a;
        }
        if (length == 1) {
            return x0.f(Short.valueOf(sArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(sArr.length));
        Jy(sArr, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static Iterable<Float> H5(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr.length == 0 ? EmptyList.f217510a : new f(fArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, ? super Long>> M H6(@NotNull long[] jArr, @NotNull M destination, @NotNull ed.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (long j10 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j10)), Long.valueOf(j10));
        }
        return destination;
    }

    @Xc.f
    public static final long H7(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr[0];
    }

    @InterfaceC4887e0(version = "2.2")
    @InterfaceC5043v
    @Xc.f
    public static final float[] H8(float[] fArr, int i10, ed.l<? super Integer, Float> init) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
        kotlin.jvm.internal.G.o(fArrCopyOf, "copyOf(...)");
        for (int length = fArr.length; length < i10; length++) {
            fArrCopyOf[length] = init.invoke(Integer.valueOf(length)).floatValue();
        }
        return fArrCopyOf;
    }

    @NotNull
    public static final List<Character> H9(@NotNull char[] cArr, int i10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = cArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Px(cArr, length);
    }

    @NotNull
    public static final <R, V> List<V> HA(@NotNull float[] fArr, @NotNull R[] other, @NotNull ed.p<? super Float, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> Ha(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @Xc.f
    public static final Character Hb(char[] cArr, ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
        }
        return null;
    }

    @Nullable
    public static final Short Hc(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    public static final <R> R Hd(@NotNull char[] cArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    @NotNull
    public static final md.l He(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return new md.l(0, zArr.length - 1, 1);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Hf(@NotNull double[] dArr, @NotNull M destination, @NotNull ed.l<? super Double, ? extends K> keySelector, @NotNull ed.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Hg(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr.length == 0;
    }

    public static byte Hh(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[bArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> Hi(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends R> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(transform.invoke(Short.valueOf(s10)));
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double Hj(char[] cArr, ed.l<? super Character, Double> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(cArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Hk(boolean[] zArr, ed.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Boolean.valueOf(zArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final int Hl(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i12)) < 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Hm(double[] dArr, ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Short Hn(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (s10 > s11) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final int[] Ho(int[] iArr, ed.l<? super Integer, L0> action) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (int i10 : iArr) {
            action.invoke(Integer.valueOf(i10));
        }
        return iArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Integer Hp(@NotNull int[] iArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.q(iArr.length)]);
    }

    public static final byte Hq(@NotNull byte[] bArr, @NotNull ed.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = bArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            bByteValue = operation.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i11]), Byte.valueOf(bByteValue)).byteValue();
        }
        return bByteValue;
    }

    @NotNull
    public static final <T> List<T> Hr(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<T> listNz = nz(tArr);
        Collections.reverse(listNz);
        return listNz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Hs(int[] iArr, R r10, ed.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (iArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, Integer.valueOf(i10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean Ht(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Boolean boolValueOf = null;
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                if (z10) {
                    return null;
                }
                boolValueOf = Boolean.valueOf(z11);
                z10 = true;
            }
        }
        if (z10) {
            return boolValueOf;
        }
        return null;
    }

    @NotNull
    public static final boolean[] Hu(@NotNull boolean[] zArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? new boolean[0] : C4875q.n1(zArr, indices.f221139a, indices.f221140b + 1);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> Hv(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return hw(zArr, new g.a(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final double Hw(@NotNull char[] cArr, @NotNull ed.l<? super Character, Double> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (char c10 : cArr) {
            dDoubleValue += selector.invoke(Character.valueOf(c10)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final long Hx(double[] dArr, ed.l<? super Double, kotlin.B0> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long j10 = 0;
        for (double d10 : dArr) {
            j10 += selector.invoke(Double.valueOf(d10)).f217440a;
        }
        return j10;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Long>> C Hy(@NotNull long[] jArr, @NotNull C destination) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (long j10 : jArr) {
            destination.add(Long.valueOf(j10));
        }
        return destination;
    }

    @NotNull
    public static final Set<Boolean> Hz(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return EmptySet.f217512a;
        }
        if (length == 1) {
            return x0.f(Boolean.valueOf(zArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(zArr.length));
        Ky(zArr, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static Iterable<Integer> I5(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr.length == 0 ? EmptyList.f217510a : new d(iArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M I6(@NotNull long[] jArr, @NotNull M destination, @NotNull ed.l<? super Long, ? extends K> keySelector, @NotNull ed.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (long j10 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j10)), valueTransform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @Xc.f
    public static final <T> T I7(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr[0];
    }

    @InterfaceC4887e0(version = "2.2")
    @InterfaceC5043v
    @Xc.f
    public static final int[] I8(int[] iArr, int i10, ed.l<? super Integer, Integer> init) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(...)");
        for (int length = iArr.length; length < i10; length++) {
            iArrCopyOf[length] = init.invoke(Integer.valueOf(length)).intValue();
        }
        return iArrCopyOf;
    }

    @NotNull
    public static final List<Double> I9(@NotNull double[] dArr, int i10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = dArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Qx(dArr, length);
    }

    @NotNull
    public static final <R> List<Pair<Integer, R>> IA(@NotNull int[] iArr, @NotNull Iterable<? extends R> other) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(Integer.valueOf(iArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> Ia(@NotNull byte[] bArr, @NotNull ed.p<? super Integer, ? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @Xc.f
    public static final Double Ib(double[] dArr, ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
        }
        return null;
    }

    @Nullable
    public static final Short Ic(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
        }
        return null;
    }

    public static final <R> R Id(@NotNull double[] dArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static int Ie(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr.length - 1;
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, List<Float>>> M If(@NotNull float[] fArr, @NotNull M destination, @NotNull ed.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(Float.valueOf(f10));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Ig(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr.length == 0;
    }

    public static final byte Ih(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                byte b10 = bArr[length];
                if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return b10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R> List<R> Ii(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(transform.invoke(Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double Ij(double[] dArr, ed.l<? super Double, Double> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Double.valueOf(dArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Ik(byte[] bArr, Comparator<? super R> comparator, ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final long Il(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) < 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Im(float[] fArr, ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final byte In(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (b10 > b11) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final long[] Io(long[] jArr, ed.l<? super Long, L0> action) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (long j10 : jArr) {
            action.invoke(Long.valueOf(j10));
        }
        return jArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Long Ip(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return Jp(jArr, Random.f218007a);
    }

    public static final char Iq(@NotNull char[] cArr, @NotNull ed.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = cArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            cCharValue = operation.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i11]), Character.valueOf(cCharValue)).charValue();
        }
        return cCharValue;
    }

    @NotNull
    public static final List<Short> Ir(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<Short> listOz = oz(sArr);
        Collections.reverse(listOz);
        return listOz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Is(long[] jArr, R r10, ed.p<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (jArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, Long.valueOf(j10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Byte It(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void Iu(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length > 1) {
            C4875q.h4(tArr, new g.a(selector));
        }
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> Iv(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return Zv(bArr, new g.c(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final double Iw(@NotNull double[] dArr, @NotNull ed.l<? super Double, Double> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (double d10 : dArr) {
            dDoubleValue += selector.invoke(Double.valueOf(d10)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final long Ix(float[] fArr, ed.l<? super Float, kotlin.B0> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long j10 = 0;
        for (float f10 : fArr) {
            j10 += selector.invoke(Float.valueOf(f10)).f217440a;
        }
        return j10;
    }

    @kotlin.C
    @NotNull
    public static final <T, C extends Collection<? super T>> C Iy(@NotNull T[] tArr, @NotNull C destination) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    @NotNull
    public static final short[] Iz(@NotNull Short[] shArr) {
        kotlin.jvm.internal.G.p(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = shArr[i10].shortValue();
        }
        return sArr;
    }

    @NotNull
    public static Iterable<Long> J5(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr.length == 0 ? EmptyList.f217510a : new e(jArr);
    }

    @kotlin.C
    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M J6(@NotNull T[] tArr, @NotNull M destination, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (T t10 : tArr) {
            destination.put(keySelector.invoke(t10), t10);
        }
        return destination;
    }

    @Xc.f
    public static final short J7(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr[0];
    }

    @InterfaceC4887e0(version = "2.2")
    @InterfaceC5043v
    @Xc.f
    public static final long[] J8(long[] jArr, int i10, ed.l<? super Integer, Long> init) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(...)");
        for (int length = jArr.length; length < i10; length++) {
            jArrCopyOf[length] = init.invoke(Integer.valueOf(length)).longValue();
        }
        return jArrCopyOf;
    }

    @NotNull
    public static final List<Float> J9(@NotNull float[] fArr, int i10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = fArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Rx(fArr, length);
    }

    @NotNull
    public static final <R, V> List<V> JA(@NotNull int[] iArr, @NotNull Iterable<? extends R> other, @NotNull ed.p<? super Integer, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> Ja(@NotNull char[] cArr, @NotNull ed.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c10 = cArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @Xc.f
    public static final Float Jb(float[] fArr, ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> Jc(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            N.s0(arrayList, transform.invoke(Byte.valueOf(b10)));
        }
        return arrayList;
    }

    public static final <R> R Jd(@NotNull float[] fArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final int Je(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr.length - 1;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Jf(@NotNull float[] fArr, @NotNull M destination, @NotNull ed.l<? super Float, ? extends K> keySelector, @NotNull ed.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Jg(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr.length == 0;
    }

    public static final char Jh(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[cArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> Ji(@NotNull byte[] bArr, @NotNull ed.p<? super Integer, ? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double Jj(float[] fArr, ed.l<? super Float, Double> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Float.valueOf(fArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Jk(char[] cArr, Comparator<? super R> comparator, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final <T> T Jl(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                T t11 = tArr[i10];
                if (comparator.compare(t10, t11) < 0) {
                    t10 = t11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Jm(int[] iArr, ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final char Jn(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                if (kotlin.jvm.internal.G.t(c10, c11) > 0) {
                    c10 = c11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return c10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> T[] Jo(T[] tArr, ed.l<? super T, L0> action) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (T t10 : tArr) {
            action.invoke(t10);
        }
        return tArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Long Jp(@NotNull long[] jArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.q(jArr.length)]);
    }

    public static final double Jq(@NotNull double[] dArr, @NotNull ed.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = dArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            dDoubleValue = operation.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i11]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Boolean> Jr(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (zArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<Boolean> listPz = pz(zArr);
        Collections.reverse(listPz);
        return listPz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> Js(@NotNull T[] tArr, R r10, @NotNull ed.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (tArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        for (a.b bVar : tArr) {
            r10 = operation.invoke(r10, bVar);
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Byte Jt(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Byte bValueOf = null;
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                bValueOf = Byte.valueOf(b10);
                z10 = true;
            }
        }
        if (z10) {
            return bValueOf;
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void Ju(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length > 1) {
            C4875q.h4(tArr, new g.c(selector));
        }
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> Jv(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return aw(cArr, new g.c(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final double Jw(@NotNull float[] fArr, @NotNull ed.l<? super Float, Double> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (float f10 : fArr) {
            dDoubleValue += selector.invoke(Float.valueOf(f10)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final long Jx(int[] iArr, ed.l<? super Integer, kotlin.B0> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long j10 = 0;
        for (int i10 : iArr) {
            j10 += selector.invoke(Integer.valueOf(i10)).f217440a;
        }
        return j10;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Short>> C Jy(@NotNull short[] sArr, @NotNull C destination) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (short s10 : sArr) {
            destination.add(Short.valueOf(s10));
        }
        return destination;
    }

    @NotNull
    public static final Set<Byte> Jz(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Byte> setQz = qz(bArr);
        N.s0(setQz, other);
        return setQz;
    }

    @NotNull
    public static <T> Iterable<T> K5(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr.length == 0 ? EmptyList.f217510a : new a(tArr);
    }

    @kotlin.C
    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M K6(@NotNull T[] tArr, @NotNull M destination, @NotNull ed.l<? super T, ? extends K> keySelector, @NotNull ed.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (T t10 : tArr) {
            destination.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return destination;
    }

    @Xc.f
    public static final boolean K7(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr[0];
    }

    @InterfaceC4887e0(version = "2.2")
    @InterfaceC5043v
    @Xc.f
    public static final <T> T[] K8(T[] tArr, int i10, ed.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        kotlin.jvm.internal.G.o(tArr2, "copyOf(...)");
        for (int length = tArr.length; length < i10; length++) {
            tArr2[length] = init.invoke(Integer.valueOf(length));
        }
        return tArr2;
    }

    @NotNull
    public static final List<Integer> K9(@NotNull int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = iArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Sx(iArr, length);
    }

    @NotNull
    public static final List<Pair<Integer, Integer>> KA(@NotNull int[] iArr, @NotNull int[] other) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(Integer.valueOf(iArr[i10]), Integer.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> Ka(@NotNull double[] dArr, @NotNull ed.p<? super Integer, ? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            double d10 = dArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @Xc.f
    public static final Integer Kb(int[] iArr, ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> Kc(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            N.s0(arrayList, transform.invoke(Character.valueOf(c10)));
        }
        return arrayList;
    }

    public static final <R> R Kd(@NotNull int[] iArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final int Ke(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr.length - 1;
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, List<Integer>>> M Kf(@NotNull int[] iArr, @NotNull M destination, @NotNull ed.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(Integer.valueOf(i10));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Kg(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr.length == 0;
    }

    public static final char Kh(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char c10 = cArr[length];
                if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return c10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R> List<R> Ki(@NotNull char[] cArr, @NotNull ed.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double Kj(int[] iArr, ed.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Integer.valueOf(iArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Kk(double[] dArr, Comparator<? super R> comparator, ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final short Kl(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) < 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Km(long[] jArr, ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final double Kn(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dMin = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dMin = Math.min(dMin, dArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dMin;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final short[] Ko(short[] sArr, ed.l<? super Short, L0> action) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (short s10 : sArr) {
            action.invoke(Short.valueOf(s10));
        }
        return sArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> T Kp(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return (T) Lp(tArr, Random.f218007a);
    }

    public static final float Kq(@NotNull float[] fArr, @NotNull ed.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = fArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            fFloatValue = operation.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i11]), Float.valueOf(fFloatValue)).floatValue();
        }
        return fFloatValue;
    }

    @NotNull
    public static byte[] Kr(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length - 1;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                bArr2[length - i10] = bArr[i10];
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return bArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Ks(short[] sArr, R r10, ed.p<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (sArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, Short.valueOf(s10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Character Kt(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final void Ku(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length > 1) {
            C4875q.G3(bArr);
            jr(bArr);
        }
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> Kv(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return bw(dArr, new g.c(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final double Kw(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 : iArr) {
            dDoubleValue += selector.invoke(Integer.valueOf(i10)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final long Kx(long[] jArr, ed.l<? super Long, kotlin.B0> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += selector.invoke(Long.valueOf(j11)).f217440a;
        }
        return j10;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Boolean>> C Ky(@NotNull boolean[] zArr, @NotNull C destination) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (boolean z10 : zArr) {
            destination.add(Boolean.valueOf(z10));
        }
        return destination;
    }

    @NotNull
    public static final Set<Character> Kz(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Character> setRz = rz(cArr);
        N.s0(setRz, other);
        return setRz;
    }

    @NotNull
    public static Iterable<Short> L5(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr.length == 0 ? EmptyList.f217510a : new c(sArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, ? super Short>> M L6(@NotNull short[] sArr, @NotNull M destination, @NotNull ed.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (short s10 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s10)), Short.valueOf(s10));
        }
        return destination;
    }

    @Xc.f
    public static final byte L7(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr[1];
    }

    @InterfaceC4887e0(version = "2.2")
    @InterfaceC5043v
    @Xc.f
    public static final short[] L8(short[] sArr, int i10, ed.l<? super Integer, Short> init) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
        kotlin.jvm.internal.G.o(sArrCopyOf, "copyOf(...)");
        for (int length = sArr.length; length < i10; length++) {
            sArrCopyOf[length] = init.invoke(Integer.valueOf(length)).shortValue();
        }
        return sArrCopyOf;
    }

    @NotNull
    public static final List<Long> L9(@NotNull long[] jArr, int i10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = jArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Tx(jArr, length);
    }

    @NotNull
    public static final <V> List<V> LA(@NotNull int[] iArr, @NotNull int[] other, @NotNull ed.p<? super Integer, ? super Integer, ? extends V> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> La(@NotNull float[] fArr, @NotNull ed.p<? super Integer, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f10 = fArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @Xc.f
    public static final Long Lb(long[] jArr, ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> Lc(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            N.s0(arrayList, transform.invoke(Double.valueOf(d10)));
        }
        return arrayList;
    }

    public static final <R> R Ld(@NotNull long[] jArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static int Le(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr.length - 1;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Lf(@NotNull int[] iArr, @NotNull M destination, @NotNull ed.l<? super Integer, ? extends K> keySelector, @NotNull ed.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @Xc.f
    public static final <T> boolean Lg(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr.length == 0;
    }

    public static final double Lh(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[dArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> Li(@NotNull double[] dArr, @NotNull ed.p<? super Integer, ? super Double, ? extends R> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double Lj(long[] jArr, ed.l<? super Long, Double> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Long.valueOf(jArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Lk(float[] fArr, Comparator<? super R> comparator, ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final boolean Ll(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z10 = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                boolean z11 = zArr[i10];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) < 0) {
                    z10 = z11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return z10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R extends Comparable<? super R>> R Lm(T[] tArr, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final double Ln(@NotNull Double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, dArr[i10].doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean[] Lo(boolean[] zArr, ed.l<? super Boolean, L0> action) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (boolean z10 : zArr) {
            action.invoke(Boolean.valueOf(z10));
        }
        return zArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T> T Lp(@NotNull T[] tArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.q(tArr.length)];
    }

    public static final int Lq(@NotNull int[] iArr, @NotNull ed.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = iArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            iIntValue = operation.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i11]), Integer.valueOf(iIntValue)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final char[] Lr(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int length = cArr.length - 1;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                cArr2[length - i10] = cArr[i10];
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return cArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Ls(boolean[] zArr, R r10, ed.p<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (zArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        for (boolean z10 : zArr) {
            r10 = operation.invoke(r10, Boolean.valueOf(z10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Character Lt(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                chValueOf = Character.valueOf(c10);
                z10 = true;
            }
        }
        if (z10) {
            return chValueOf;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void Lu(@NotNull byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        Arrays.sort(bArr, i10, i11);
        kr(bArr, i10, i11);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> Lv(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return cw(fArr, new g.c(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final double Lw(@NotNull long[] jArr, @NotNull ed.l<? super Long, Double> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j10 : jArr) {
            dDoubleValue += selector.invoke(Long.valueOf(j10)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final <T> long Lx(T[] tArr, ed.l<? super T, kotlin.B0> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long j10 = 0;
        for (T t10 : tArr) {
            j10 += selector.invoke(t10).f217440a;
        }
        return j10;
    }

    @NotNull
    public static final double[] Ly(@NotNull Double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = dArr[i10].doubleValue();
        }
        return dArr2;
    }

    @NotNull
    public static final Set<Double> Lz(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Double> setSz = sz(dArr);
        N.s0(setSz, other);
        return setSz;
    }

    @NotNull
    public static Iterable<Boolean> M5(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr.length == 0 ? EmptyList.f217510a : new h(zArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M M6(@NotNull short[] sArr, @NotNull M destination, @NotNull ed.l<? super Short, ? extends K> keySelector, @NotNull ed.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (short s10 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s10)), valueTransform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    @Xc.f
    public static final char M7(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr[1];
    }

    @InterfaceC4887e0(version = "2.2")
    @InterfaceC5043v
    @Xc.f
    public static final boolean[] M8(boolean[] zArr, int i10, ed.l<? super Integer, Boolean> init) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
        kotlin.jvm.internal.G.o(zArrCopyOf, "copyOf(...)");
        for (int length = zArr.length; length < i10; length++) {
            zArrCopyOf[length] = init.invoke(Integer.valueOf(length)).booleanValue();
        }
        return zArrCopyOf;
    }

    @NotNull
    public static final <T> List<T> M9(@NotNull T[] tArr, int i10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = tArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Ux(tArr, length);
    }

    @NotNull
    public static final <R> List<Pair<Integer, R>> MA(@NotNull int[] iArr, @NotNull R[] other) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = iArr[i10];
            arrayList.add(new Pair(Integer.valueOf(i11), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> Ma(@NotNull int[] iArr, @NotNull ed.p<? super Integer, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Integer.valueOf(i12)).booleanValue()) {
                arrayList.add(Integer.valueOf(i12));
            }
            i10++;
            i11 = i13;
        }
        return arrayList;
    }

    @Xc.f
    public static final <T> T Mb(T[] tArr, ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> Mc(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            N.s0(arrayList, transform.invoke(Float.valueOf(f10)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Md(@NotNull T[] tArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, tArr[i10]);
            i10++;
            i11++;
        }
        return r10;
    }

    public static int Me(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr.length - 1;
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, List<Long>>> M Mf(@NotNull long[] jArr, @NotNull M destination, @NotNull ed.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(Long.valueOf(j10));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Mg(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr.length == 0;
    }

    public static final double Mh(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                double d10 = dArr[length];
                if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return d10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R> List<R> Mi(@NotNull float[] fArr, @NotNull ed.p<? super Integer, ? super Float, ? extends R> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> double Mj(T[] tArr, ed.l<? super T, Double> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(tArr[i10]).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Mk(int[] iArr, Comparator<? super R> comparator, ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean Ml(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (length == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        if (1 <= length) {
            while (true) {
                boolean z11 = zArr[i10];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Mm(short[] sArr, ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final float Mn(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMin = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fMin;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final byte[] Mo(byte[] bArr, ed.p<? super Integer, ? super Byte, L0> action) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
        return bArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Short Mp(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return Np(sArr, Random.f218007a);
    }

    public static final long Mq(@NotNull long[] jArr, @NotNull ed.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = jArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            jLongValue = operation.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i11]), Long.valueOf(jLongValue)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final double[] Mr(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int length = dArr.length - 1;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                dArr2[length - i10] = dArr[i10];
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Ms(byte[] bArr, R r10, ed.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (bArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Byte.valueOf(bArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Double Mt(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    public static final void Mu(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length > 1) {
            C4875q.I3(cArr);
            lr(cArr);
        }
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> Mv(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return dw(iArr, new g.c(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final <T> double Mw(@NotNull T[] tArr, @NotNull ed.l<? super T, Double> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (T t10 : tArr) {
            dDoubleValue += selector.invoke(t10).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final long Mx(short[] sArr, ed.l<? super Short, kotlin.B0> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long j10 = 0;
        for (short s10 : sArr) {
            j10 += selector.invoke(Short.valueOf(s10)).f217440a;
        }
        return j10;
    }

    @NotNull
    public static final float[] My(@NotNull Float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = fArr[i10].floatValue();
        }
        return fArr2;
    }

    @NotNull
    public static final Set<Float> Mz(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Float> setTz = tz(fArr);
        N.s0(setTz, other);
        return setTz;
    }

    @NotNull
    public static final InterfaceC5000m<Byte> N5(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr.length == 0 ? C4994g.f218169a : new k(bArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, ? super Boolean>> M N6(@NotNull boolean[] zArr, @NotNull M destination, @NotNull ed.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (boolean z10 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z10)), Boolean.valueOf(z10));
        }
        return destination;
    }

    @Xc.f
    public static final double N7(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr[1];
    }

    @Xc.f
    public static final int N8(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr.length;
    }

    @NotNull
    public static final List<Short> N9(@NotNull short[] sArr, int i10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = sArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Vx(sArr, length);
    }

    @NotNull
    public static final <R, V> List<V> NA(@NotNull int[] iArr, @NotNull R[] other, @NotNull ed.p<? super Integer, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> Na(@NotNull long[] jArr, @NotNull ed.p<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @Xc.f
    public static final Short Nb(short[] sArr, ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> Nc(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i10)));
        }
        return arrayList;
    }

    public static final <R> R Nd(@NotNull short[] sArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static int Ne(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr.length - 1;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Nf(@NotNull long[] jArr, @NotNull M destination, @NotNull ed.l<? super Long, ? extends K> keySelector, @NotNull ed.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Ng(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr.length == 0;
    }

    public static final float Nh(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[fArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> Ni(@NotNull int[] iArr, @NotNull ed.p<? super Integer, ? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double Nj(short[] sArr, ed.l<? super Short, Double> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Short.valueOf(sArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Nk(long[] jArr, Comparator<? super R> comparator, ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte Nl(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (length == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Nm(boolean[] zArr, ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final float Nn(@NotNull Float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = fArr[0].floatValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, fArr[i10].floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final char[] No(char[] cArr, ed.p<? super Integer, ? super Character, L0> action) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
        return cArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Short Np(@NotNull short[] sArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.q(sArr.length)]);
    }

    public static final <S, T extends S> S Nq(@NotNull T[] tArr, @NotNull ed.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = tArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            sInvoke = operation.invoke(Integer.valueOf(i11), (Object) tArr[i11], sInvoke);
        }
        return sInvoke;
    }

    @NotNull
    public static final float[] Nr(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length - 1;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                fArr2[length - i10] = fArr[i10];
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Ns(char[] cArr, R r10, ed.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (cArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(cArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Double Nt(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Double dValueOf = null;
        boolean z10 = false;
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                dValueOf = Double.valueOf(d10);
                z10 = true;
            }
        }
        if (z10) {
            return dValueOf;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void Nu(@NotNull char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        Arrays.sort(cArr, i10, i11);
        mr(cArr, i10, i11);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> Nv(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return ew(jArr, new g.c(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final double Nw(@NotNull short[] sArr, @NotNull ed.l<? super Short, Double> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s10 : sArr) {
            dDoubleValue += selector.invoke(Short.valueOf(s10)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final long Nx(boolean[] zArr, ed.l<? super Boolean, kotlin.B0> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long j10 = 0;
        for (boolean z10 : zArr) {
            j10 += selector.invoke(Boolean.valueOf(z10)).f217440a;
        }
        return j10;
    }

    @NotNull
    public static final HashSet<Byte> Ny(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        HashSet<Byte> hashSet = new HashSet<>(m0.j(bArr.length));
        Cy(bArr, hashSet);
        return hashSet;
    }

    @NotNull
    public static final Set<Integer> Nz(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Integer> setUz = uz(iArr);
        N.s0(setUz, other);
        return setUz;
    }

    @NotNull
    public static final InterfaceC5000m<Character> O5(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr.length == 0 ? C4994g.f218169a : new r(cArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M O6(@NotNull boolean[] zArr, @NotNull M destination, @NotNull ed.l<? super Boolean, ? extends K> keySelector, @NotNull ed.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (boolean z10 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z10)), valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @Xc.f
    public static final float O7(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr[1];
    }

    public static final int O8(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Boolean> O9(@NotNull boolean[] zArr, int i10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = zArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Wx(zArr, length);
    }

    @NotNull
    public static final <R> List<Pair<Long, R>> OA(@NotNull long[] jArr, @NotNull Iterable<? extends R> other) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(Long.valueOf(jArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> Oa(@NotNull T[] tArr, @NotNull ed.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), t10).booleanValue()) {
                arrayList.add(t10);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @Xc.f
    public static final Boolean Ob(boolean[] zArr, ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            boolean z10 = zArr[length];
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> Oc(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            N.s0(arrayList, transform.invoke(Long.valueOf(j10)));
        }
        return arrayList;
    }

    public static final <R> R Od(@NotNull boolean[] zArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static <T> int Oe(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr.length - 1;
    }

    @kotlin.C
    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M Of(@NotNull T[] tArr, @NotNull M destination, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(t10);
        }
        return destination;
    }

    @Xc.f
    public static final boolean Og(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final float Oh(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                float f10 = fArr[length];
                if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return f10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R> List<R> Oi(@NotNull long[] jArr, @NotNull ed.p<? super Integer, ? super Long, ? extends R> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double Oj(boolean[] zArr, ed.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R> R Ok(T[] tArr, Comparator<? super R> comparator, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character Ol(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (length == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double Om(byte[] bArr, ed.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Byte.valueOf(bArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static int On(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double[] Oo(double[] dArr, ed.p<? super Integer, ? super Double, L0> action) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
        return dArr;
    }

    public static final byte Op(@NotNull byte[] bArr, @NotNull ed.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return bByteValue;
    }

    public static final short Oq(@NotNull short[] sArr, @NotNull ed.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = sArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            sShortValue = operation.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i11]), Short.valueOf(sShortValue)).shortValue();
        }
        return sShortValue;
    }

    @NotNull
    public static int[] Or(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int length = iArr.length - 1;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                iArr2[length - i10] = iArr[i10];
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return iArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Os(double[] dArr, R r10, ed.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (dArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Double.valueOf(dArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Float Ot(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    public static final void Ou(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length > 1) {
            C4875q.K3(dArr);
            nr(dArr);
        }
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> Ov(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return fw(tArr, new g.c(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final double Ow(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z10 : zArr) {
            dDoubleValue += selector.invoke(Boolean.valueOf(z10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Byte> Ox(@NotNull byte[] bArr, int i10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= bArr.length) {
            return Xy(bArr);
        }
        if (i10 == 1) {
            return H.l(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final HashSet<Character> Oy(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        int length = cArr.length;
        if (length > 128) {
            length = 128;
        }
        HashSet<Character> hashSet = new HashSet<>(m0.j(length));
        Dy(cArr, hashSet);
        return hashSet;
    }

    @NotNull
    public static final Set<Long> Oz(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Long> setVz = vz(jArr);
        N.s0(setVz, other);
        return setVz;
    }

    @NotNull
    public static final InterfaceC5000m<Double> P5(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr.length == 0 ? C4994g.f218169a : new p(dArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M P6(@NotNull byte[] bArr, @NotNull M destination, @NotNull ed.l<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (byte b10 : bArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Byte.valueOf(b10));
            destination.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return destination;
    }

    @Xc.f
    public static final int P7(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr[1];
    }

    @Xc.f
    public static final int P8(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr.length;
    }

    @NotNull
    public static final List<Byte> P9(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = bArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (predicate.invoke(Byte.valueOf(bArr[length])).booleanValue());
        return Ox(bArr, length + 1);
    }

    @NotNull
    public static final <R, V> List<V> PA(@NotNull long[] jArr, @NotNull Iterable<? extends R> other, @NotNull ed.p<? super Long, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> Pa(@NotNull short[] sArr, @NotNull ed.p<? super Integer, ? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s10 = sArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @Xc.f
    public static final Byte Pb(byte[] bArr, ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            byte b10 = bArr[length];
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <T, R> List<R> Pc(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            N.s0(arrayList, transform.invoke(t10));
        }
        return arrayList;
    }

    public static final <R> R Pd(@NotNull byte[] bArr, R r10, @NotNull ed.p<? super Byte, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = bArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Byte.valueOf(bArr[length]), r10);
        }
        return r10;
    }

    public static int Pe(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr.length - 1;
    }

    @kotlin.C
    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M Pf(@NotNull T[] tArr, @NotNull M destination, @NotNull ed.l<? super T, ? extends K> keySelector, @NotNull ed.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(t10));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Pg(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static int Ph(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[iArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <T, R> List<R> Pi(@NotNull T[] tArr, @NotNull ed.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float Pj(byte[] bArr, ed.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Byte.valueOf(bArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Pk(short[] sArr, Comparator<? super R> comparator, ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double Pl(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (length == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        if (1 <= length) {
            while (true) {
                double d11 = dArr[i10];
                R rInvoke2 = selector.invoke(Double.valueOf(d11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d10 = d11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double Pm(char[] cArr, ed.l<? super Character, Double> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(cArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final long Pn(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (j10 > j11) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float[] Po(float[] fArr, ed.p<? super Integer, ? super Float, L0> action) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
        return fArr;
    }

    public static final char Pp(@NotNull char[] cArr, @NotNull ed.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i10])).charValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return cCharValue;
    }

    public static final boolean Pq(@NotNull boolean[] zArr, @NotNull ed.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = zArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            zBooleanValue = operation.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i11]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return zBooleanValue;
    }

    @NotNull
    public static long[] Pr(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int length = jArr.length - 1;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                jArr2[length - i10] = jArr[i10];
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return jArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Ps(float[] fArr, R r10, ed.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (fArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Float.valueOf(fArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Float Pt(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Float fValueOf = null;
        boolean z10 = false;
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                fValueOf = Float.valueOf(f10);
                z10 = true;
            }
        }
        if (z10) {
            return fValueOf;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void Pu(@NotNull double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        Arrays.sort(dArr, i10, i11);
        or(dArr, i10, i11);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> Pv(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return gw(sArr, new g.c(selector));
    }

    @dd.j(name = "sumOfByte")
    public static final int Pw(@NotNull Byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        int iByteValue = 0;
        for (Byte b10 : bArr) {
            iByteValue += b10.byteValue();
        }
        return iByteValue;
    }

    @NotNull
    public static final List<Character> Px(@NotNull char[] cArr, int i10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= cArr.length) {
            return Yy(cArr);
        }
        if (i10 == 1) {
            return H.l(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final HashSet<Double> Py(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        HashSet<Double> hashSet = new HashSet<>(m0.j(dArr.length));
        Ey(dArr, hashSet);
        return hashSet;
    }

    @NotNull
    public static final <T> Set<T> Pz(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<T> setWz = wz(tArr);
        N.s0(setWz, other);
        return setWz;
    }

    @NotNull
    public static final InterfaceC5000m<Float> Q5(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr.length == 0 ? C4994g.f218169a : new o(fArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M Q6(@NotNull char[] cArr, @NotNull M destination, @NotNull ed.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (char c10 : cArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(c10));
            destination.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return destination;
    }

    @Xc.f
    public static final long Q7(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr[1];
    }

    public static final int Q8(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Character> Q9(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = cArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (predicate.invoke(Character.valueOf(cArr[length])).booleanValue());
        return Px(cArr, length + 1);
    }

    @NotNull
    public static final List<Pair<Long, Long>> QA(@NotNull long[] jArr, @NotNull long[] other) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(Long.valueOf(jArr[i10]), Long.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> Qa(@NotNull boolean[] zArr, @NotNull ed.p<? super Integer, ? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            boolean z10 = zArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @Xc.f
    public static final Character Qb(char[] cArr, ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char c10 = cArr[length];
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> Qc(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            N.s0(arrayList, transform.invoke(Short.valueOf(s10)));
        }
        return arrayList;
    }

    public static final <R> R Qd(@NotNull char[] cArr, R r10, @NotNull ed.p<? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = cArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Character.valueOf(cArr[length]), r10);
        }
        return r10;
    }

    public static final int Qe(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr.length - 1;
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, List<Short>>> M Qf(@NotNull short[] sArr, @NotNull M destination, @NotNull ed.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(Short.valueOf(s10));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Qg(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return !(dArr.length == 0);
    }

    public static final int Qh(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                int i11 = iArr[length];
                if (!predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return i11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R> List<R> Qi(@NotNull short[] sArr, @NotNull ed.p<? super Integer, ? super Short, ? extends R> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float Qj(char[] cArr, ed.l<? super Character, Float> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(cArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Qk(boolean[] zArr, Comparator<? super R> comparator, ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float Ql(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (length == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        if (1 <= length) {
            while (true) {
                float f11 = fArr[i10];
                R rInvoke2 = selector.invoke(Float.valueOf(f11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f10 = f11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double Qm(double[] dArr, ed.l<? super Double, Double> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Double.valueOf(dArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T Qn(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                T t11 = tArr[i10];
                if (t10.compareTo(t11) > 0) {
                    t10 = t11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final int[] Qo(int[] iArr, ed.p<? super Integer, ? super Integer, L0> action) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
        return iArr;
    }

    public static final double Qp(@NotNull double[] dArr, @NotNull ed.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Boolean Qq(@NotNull boolean[] zArr, @NotNull ed.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = zArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            zBooleanValue = operation.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i11]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @NotNull
    public static final <T> T[] Qr(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) C4873o.a(tArr, tArr.length);
        int length = tArr.length - 1;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                tArr2[length - i10] = tArr[i10];
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return tArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Qs(int[] iArr, R r10, ed.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (iArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Integer.valueOf(iArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Integer Qt(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    public static final void Qu(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length > 1) {
            C4875q.M3(fArr);
            pr(fArr);
        }
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> Qv(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return hw(zArr, new g.c(selector));
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final double Qw(byte[] bArr, ed.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b10 : bArr) {
            dDoubleValue += selector.invoke(Byte.valueOf(b10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Double> Qx(@NotNull double[] dArr, int i10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= dArr.length) {
            return Zy(dArr);
        }
        if (i10 == 1) {
            return H.l(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final HashSet<Float> Qy(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        HashSet<Float> hashSet = new HashSet<>(m0.j(fArr.length));
        Fy(fArr, hashSet);
        return hashSet;
    }

    @NotNull
    public static final Set<Short> Qz(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Short> setXz = xz(sArr);
        N.s0(setXz, other);
        return setXz;
    }

    @NotNull
    public static final InterfaceC5000m<Integer> R5(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr.length == 0 ? C4994g.f218169a : new m(iArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M R6(@NotNull double[] dArr, @NotNull M destination, @NotNull ed.l<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (double d10 : dArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Double.valueOf(d10));
            destination.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return destination;
    }

    @Xc.f
    public static final <T> T R7(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr[1];
    }

    @Xc.f
    public static final int R8(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr.length;
    }

    @NotNull
    public static final List<Double> R9(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = dArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (predicate.invoke(Double.valueOf(dArr[length])).booleanValue());
        return Qx(dArr, length + 1);
    }

    @NotNull
    public static final <V> List<V> RA(@NotNull long[] jArr, @NotNull long[] other, @NotNull ed.p<? super Long, ? super Long, ? extends V> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), Long.valueOf(other[i10])));
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Byte>> C Ra(@NotNull byte[] bArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @Xc.f
    public static final Double Rb(double[] dArr, ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            double d10 = dArr[length];
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> Rc(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            N.s0(arrayList, transform.invoke(Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    public static final <R> R Rd(@NotNull double[] dArr, R r10, @NotNull ed.p<? super Double, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = dArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Double.valueOf(dArr[length]), r10);
        }
        return r10;
    }

    @Xc.f
    public static final byte Re(byte[] bArr, int i10, ed.l<? super Integer, Byte> defaultValue) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= bArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).byteValue() : bArr[i10];
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Rf(@NotNull short[] sArr, @NotNull M destination, @NotNull ed.l<? super Short, ? extends K> keySelector, @NotNull ed.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Rg(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return !(fArr.length == 0);
    }

    public static long Rh(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[jArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> Ri(@NotNull boolean[] zArr, @NotNull ed.p<? super Integer, ? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float Rj(double[] dArr, ed.l<? super Double, Float> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Double.valueOf(dArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Rk(byte[] bArr, Comparator<? super R> comparator, ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer Rl(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (length == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i10 = i12;
                    rInvoke = rInvoke2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double Rm(float[] fArr, ed.l<? super Float, Double> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Float.valueOf(fArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final short Rn(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (s10 > s11) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final long[] Ro(long[] jArr, ed.p<? super Integer, ? super Long, L0> action) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
        return jArr;
    }

    public static final float Rp(@NotNull float[] fArr, @NotNull ed.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Byte Rq(@NotNull byte[] bArr, @NotNull ed.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = bArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        byte bByteValue = bArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            bByteValue = operation.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i11]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @NotNull
    public static short[] Rr(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int length = sArr.length - 1;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                sArr2[length - i10] = sArr[i10];
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return sArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Rs(long[] jArr, R r10, ed.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (jArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Long.valueOf(jArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Integer Rt(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Integer numValueOf = null;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                numValueOf = Integer.valueOf(i10);
                z10 = true;
            }
        }
        if (z10) {
            return numValueOf;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.4")
    public static void Ru(@NotNull float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        Arrays.sort(fArr, i10, i11);
        qr(fArr, i10, i11);
    }

    @NotNull
    public static final List<Byte> Rv(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(...)");
        C4875q.G3(bArrCopyOf);
        return Br(bArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final double Rw(char[] cArr, ed.l<? super Character, Double> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (char c10 : cArr) {
            dDoubleValue += selector.invoke(Character.valueOf(c10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Float> Rx(@NotNull float[] fArr, int i10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= fArr.length) {
            return az(fArr);
        }
        if (i10 == 1) {
            return H.l(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final HashSet<Integer> Ry(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        HashSet<Integer> hashSet = new HashSet<>(m0.j(iArr.length));
        Gy(iArr, hashSet);
        return hashSet;
    }

    @NotNull
    public static final Set<Boolean> Rz(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Boolean> setYz = yz(zArr);
        N.s0(setYz, other);
        return setYz;
    }

    @NotNull
    public static final InterfaceC5000m<Long> S5(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr.length == 0 ? C4994g.f218169a : new n(jArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M S6(@NotNull float[] fArr, @NotNull M destination, @NotNull ed.l<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (float f10 : fArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Float.valueOf(f10));
            destination.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return destination;
    }

    @Xc.f
    public static final short S7(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr[1];
    }

    public static final int S8(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Float> S9(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = fArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (predicate.invoke(Float.valueOf(fArr[length])).booleanValue());
        return Rx(fArr, length + 1);
    }

    @NotNull
    public static final <R> List<Pair<Long, R>> SA(@NotNull long[] jArr, @NotNull R[] other) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            long j10 = jArr[i10];
            arrayList.add(new Pair(Long.valueOf(j10), other[i10]));
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Character>> C Sa(@NotNull char[] cArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c10 = cArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @Xc.f
    public static final Float Sb(float[] fArr, ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            float f10 = fArr[length];
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <R> List<R> Sc(byte[] bArr, ed.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R Sd(@NotNull float[] fArr, R r10, @NotNull ed.p<? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = fArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Float.valueOf(fArr[length]), r10);
        }
        return r10;
    }

    @Xc.f
    public static final char Se(char[] cArr, int i10, ed.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= cArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : cArr[i10];
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, List<Boolean>>> M Sf(@NotNull boolean[] zArr, @NotNull M destination, @NotNull ed.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(Boolean.valueOf(z10));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Sg(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static final long Sh(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                long j10 = jArr[length];
                if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return j10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <T, R> List<R> Si(@NotNull T[] tArr, @NotNull ed.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), tArr[i10]);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float Sj(float[] fArr, ed.l<? super Float, Float> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Float.valueOf(fArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Sk(char[] cArr, Comparator<? super R> comparator, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long Sl(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (length == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double Sm(int[] iArr, ed.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Integer.valueOf(iArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Boolean Sn(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                boolean z11 = zArr[i10];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) > 0) {
                    z10 = z11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> T[] So(T[] tArr, ed.p<? super Integer, ? super T, L0> action) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), tArr[i10]);
            i10++;
            i11++;
        }
        return tArr;
    }

    public static final int Sp(@NotNull int[] iArr, @NotNull ed.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[0];
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character Sq(@NotNull char[] cArr, @NotNull ed.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = cArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        char cCharValue = cArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            cCharValue = operation.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i11]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @NotNull
    public static final boolean[] Sr(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int length = zArr.length - 1;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                zArr2[length - i10] = zArr[i10];
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> Ss(@NotNull T[] tArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (tArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, tArr[i10]);
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Long St(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final void Su(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length > 1) {
            C4875q.O3(iArr);
            rr(iArr);
        }
    }

    @NotNull
    public static final List<Character> Sv(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.G.o(cArrCopyOf, "copyOf(...)");
        C4875q.I3(cArrCopyOf);
        return Cr(cArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final double Sw(double[] dArr, ed.l<? super Double, Double> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (double d10 : dArr) {
            dDoubleValue += selector.invoke(Double.valueOf(d10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Integer> Sx(@NotNull int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= iArr.length) {
            return bz(iArr);
        }
        if (i10 == 1) {
            return H.l(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (int i12 : iArr) {
            arrayList.add(Integer.valueOf(i12));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final HashSet<Long> Sy(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        HashSet<Long> hashSet = new HashSet<>(m0.j(jArr.length));
        Hy(jArr, hashSet);
        return hashSet;
    }

    @NotNull
    public static final Iterable<C4858c0<Byte>> Sz(@NotNull final byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.collections.w
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return C4957i.b(bArr);
            }
        });
    }

    @NotNull
    public static <T> InterfaceC5000m<T> T5(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr.length == 0 ? C4994g.f218169a : new j(tArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M T6(@NotNull int[] iArr, @NotNull M destination, @NotNull ed.l<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (int i10 : iArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Integer.valueOf(i10));
            destination.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return destination;
    }

    @Xc.f
    public static final boolean T7(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr[1];
    }

    @Xc.f
    public static final int T8(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr.length;
    }

    @NotNull
    public static final List<Integer> T9(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = iArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (predicate.invoke(Integer.valueOf(iArr[length])).booleanValue());
        return Sx(iArr, length + 1);
    }

    @NotNull
    public static final <R, V> List<V> TA(@NotNull long[] jArr, @NotNull R[] other, @NotNull ed.p<? super Long, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Double>> C Ta(@NotNull double[] dArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            double d10 = dArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Double.valueOf(d10)).booleanValue()) {
                destination.add(Double.valueOf(d10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @Xc.f
    public static final Integer Tb(int[] iArr, ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            int i11 = iArr[length];
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return Integer.valueOf(i11);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <R> List<R> Tc(char[] cArr, ed.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R Td(@NotNull int[] iArr, R r10, @NotNull ed.p<? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = iArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(iArr[length]), r10);
        }
        return r10;
    }

    @Xc.f
    public static final double Te(double[] dArr, int i10, ed.l<? super Integer, Double> defaultValue) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= dArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).doubleValue() : dArr[i10];
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Tf(@NotNull boolean[] zArr, @NotNull M destination, @NotNull ed.l<? super Boolean, ? extends K> keySelector, @NotNull ed.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @Xc.f
    public static final boolean Tg(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static <T> T Th(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[tArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @kotlin.C
    @NotNull
    public static final <T, R, C extends Collection<? super R>> C Ti(@NotNull T[] tArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), tArr[i10]);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float Tj(int[] iArr, ed.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Integer.valueOf(iArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Tk(double[] dArr, Comparator<? super R> comparator, ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T Tl(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(t10);
            if (1 <= length) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double Tm(long[] jArr, ed.l<? super Long, Double> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Long.valueOf(jArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Byte Tn(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) > 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final short[] To(short[] sArr, ed.p<? super Integer, ? super Short, L0> action) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
        return sArr;
    }

    public static final long Tp(@NotNull long[] jArr, @NotNull ed.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return jLongValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double Tq(@NotNull double[] dArr, @NotNull ed.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = dArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        double dDoubleValue = dArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            dDoubleValue = operation.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i11]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Tr(byte[] bArr, R r10, ed.p<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (bArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, Byte.valueOf(b10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Ts(short[] sArr, R r10, ed.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (sArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Short.valueOf(sArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static final Long Tt(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Long lValueOf = null;
        boolean z10 = false;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                lValueOf = Long.valueOf(j10);
                z10 = true;
            }
        }
        if (z10) {
            return lValueOf;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.4")
    public static void Tu(@NotNull int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
        sr(iArr, i10, i11);
    }

    @NotNull
    public static final List<Double> Tv(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.G.o(dArrCopyOf, "copyOf(...)");
        C4875q.K3(dArrCopyOf);
        return Dr(dArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final double Tw(float[] fArr, ed.l<? super Float, Double> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (float f10 : fArr) {
            dDoubleValue += selector.invoke(Float.valueOf(f10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Long> Tx(@NotNull long[] jArr, int i10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= jArr.length) {
            return cz(jArr);
        }
        if (i10 == 1) {
            return H.l(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static <T> HashSet<T> Ty(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        HashSet<T> hashSet = new HashSet<>(m0.j(tArr.length));
        Iy(tArr, hashSet);
        return hashSet;
    }

    @NotNull
    public static final Iterable<C4858c0<Character>> Tz(@NotNull final char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.collections.r
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return C4957i.c(cArr);
            }
        });
    }

    public static Iterator U4(char[] cArr) {
        return C4957i.c(cArr);
    }

    @NotNull
    public static final InterfaceC5000m<Short> U5(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr.length == 0 ? C4994g.f218169a : new l(sArr);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M U6(@NotNull long[] jArr, @NotNull M destination, @NotNull ed.l<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (long j10 : jArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Long.valueOf(j10));
            destination.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return destination;
    }

    @Xc.f
    public static final byte U7(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr[2];
    }

    public static final int U8(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Long> U9(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = jArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (predicate.invoke(Long.valueOf(jArr[length])).booleanValue());
        return Tx(jArr, length + 1);
    }

    @NotNull
    public static final <T, R> List<Pair<T, R>> UA(@NotNull T[] tArr, @NotNull Iterable<? extends R> other) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(tArr[i10], r10));
            i10++;
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Float>> C Ua(@NotNull float[] fArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f10 = fArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Float.valueOf(f10)).booleanValue()) {
                destination.add(Float.valueOf(f10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @Xc.f
    public static final Long Ub(long[] jArr, ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            long j10 = jArr[length];
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <R> List<R> Uc(double[] dArr, ed.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R Ud(@NotNull long[] jArr, R r10, @NotNull ed.p<? super Long, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = jArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Long.valueOf(jArr[length]), r10);
        }
        return r10;
    }

    @Xc.f
    public static final float Ue(float[] fArr, int i10, ed.l<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= fArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).floatValue() : fArr[i10];
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, K> Y<T, K> Uf(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        return new s(tArr, keySelector);
    }

    @Xc.f
    public static final <T> boolean Ug(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return !(tArr.length == 0);
    }

    public static final <T> T Uh(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                T t10 = tArr[length];
                if (!predicate.invoke(t10).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return t10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C Ui(@NotNull byte[] bArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float Uj(long[] jArr, ed.l<? super Long, Float> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Long.valueOf(jArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Uk(float[] fArr, Comparator<? super R> comparator, ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short Ul(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (length == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                R rInvoke2 = selector.invoke(Short.valueOf(s11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s10 = s11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> Double Um(T[] tArr, ed.l<? super T, Double> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(tArr[i10]).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character Un(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) > 0) {
                    c10 = c11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean[] Uo(boolean[] zArr, ed.p<? super Integer, ? super Boolean, L0> action) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
        return zArr;
    }

    public static final <S, T extends S> S Up(@NotNull T[] tArr, @NotNull ed.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (Object) tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                sInvoke = operation.invoke(sInvoke, (Object) tArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float Uq(@NotNull float[] fArr, @NotNull ed.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = fArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        float fFloatValue = fArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            fFloatValue = operation.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i11]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Ur(char[] cArr, R r10, ed.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (cArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        for (char c10 : cArr) {
            r10 = operation.invoke(r10, Character.valueOf(c10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Us(boolean[] zArr, R r10, ed.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (zArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Boolean.valueOf(zArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Nullable
    public static <T> T Ut(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final void Uu(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length > 1) {
            C4875q.Q3(jArr);
            tr(jArr);
        }
    }

    @NotNull
    public static final List<Float> Uv(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.G.o(fArrCopyOf, "copyOf(...)");
        C4875q.M3(fArrCopyOf);
        return Er(fArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final double Uw(int[] iArr, ed.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 : iArr) {
            dDoubleValue += selector.invoke(Integer.valueOf(i10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <T> List<T> Ux(@NotNull T[] tArr, int i10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= tArr.length) {
            return dz(tArr);
        }
        if (i10 == 1) {
            return H.l(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (T t10 : tArr) {
            arrayList.add(t10);
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final HashSet<Short> Uy(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        HashSet<Short> hashSet = new HashSet<>(m0.j(sArr.length));
        Jy(sArr, hashSet);
        return hashSet;
    }

    @NotNull
    public static final Iterable<C4858c0<Double>> Uz(@NotNull final double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.collections.z
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return C4957i.d(dArr);
            }
        });
    }

    public static Iterator V4(Object[] objArr) {
        return C4956h.a(objArr);
    }

    @NotNull
    public static final InterfaceC5000m<Boolean> V5(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr.length == 0 ? C4994g.f218169a : new q(zArr);
    }

    @kotlin.C
    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M V6(@NotNull T[] tArr, @NotNull M destination, @NotNull ed.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (T t10 : tArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(t10);
            destination.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return destination;
    }

    @Xc.f
    public static final char V7(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr[2];
    }

    @Xc.f
    public static final int V8(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr.length;
    }

    @NotNull
    public static final <T> List<T> V9(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = tArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (predicate.invoke(tArr[length]).booleanValue());
        return Ux(tArr, length + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, R, V> List<V> VA(@NotNull T[] tArr, @NotNull Iterable<? extends R> other, @NotNull ed.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(tArr[i10], r10));
            i10++;
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Integer>> C Va(@NotNull int[] iArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Integer.valueOf(i12)).booleanValue()) {
                destination.add(Integer.valueOf(i12));
            }
            i10++;
            i11 = i13;
        }
        return destination;
    }

    @Xc.f
    public static final <T> T Vb(T[] tArr, ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            T t10 = tArr[length];
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <R> List<R> Vc(float[] fArr, ed.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Vd(@NotNull T[] tArr, R r10, @NotNull ed.p<? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = tArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(tArr[length], r10);
        }
        return r10;
    }

    @Xc.f
    public static final int Ve(int[] iArr, int i10, ed.l<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= iArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).intValue() : iArr[i10];
    }

    public static int Vf(@NotNull byte[] bArr, byte b10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @Xc.f
    public static final boolean Vg(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return !(sArr.length == 0);
    }

    public static short Vh(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[sArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C Vi(@NotNull char[] cArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> float Vj(T[] tArr, ed.l<? super T, Float> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(tArr[i10]).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Vk(int[] iArr, Comparator<? super R> comparator, ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> byte Vl(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Byte.valueOf(b10));
            if (1 <= length) {
                while (true) {
                    byte b11 = bArr[i10];
                    R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        b10 = b11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return b10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double Vm(short[] sArr, ed.l<? super Short, Double> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Short.valueOf(sArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double Vn(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                double d11 = dArr[i10];
                if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) > 0) {
                    d10 = d11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @NotNull
    public static final Pair<List<Byte>, List<Byte>> Vo(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            } else {
                arrayList2.add(Byte.valueOf(b10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final short Vp(@NotNull short[] sArr, @NotNull ed.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return sShortValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Integer Vq(@NotNull int[] iArr, @NotNull ed.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = iArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        int iIntValue = iArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            iIntValue = operation.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i11]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Vr(double[] dArr, R r10, ed.p<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (dArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        for (double d10 : dArr) {
            r10 = operation.invoke(r10, Double.valueOf(d10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void Vs(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        Ws(bArr, Random.f218007a);
    }

    @Nullable
    public static final <T> T Vt(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.4")
    public static void Vu(@NotNull long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        Arrays.sort(jArr, i10, i11);
        ur(jArr, i10, i11);
    }

    @NotNull
    public static final List<Integer> Vv(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(...)");
        C4875q.O3(iArrCopyOf);
        return Fr(iArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final double Vw(long[] jArr, ed.l<? super Long, Double> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j10 : jArr) {
            dDoubleValue += selector.invoke(Long.valueOf(j10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Short> Vx(@NotNull short[] sArr, int i10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= sArr.length) {
            return ez(sArr);
        }
        if (i10 == 1) {
            return H.l(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final HashSet<Boolean> Vy(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        HashSet<Boolean> hashSet = new HashSet<>(m0.j(zArr.length));
        Ky(zArr, hashSet);
        return hashSet;
    }

    @NotNull
    public static final Iterable<C4858c0<Float>> Vz(@NotNull final float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.collections.t
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return C4957i.e(fArr);
            }
        });
    }

    public static Iterator W4(long[] jArr) {
        return C4957i.g(jArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> W5(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(bArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (byte b10 : bArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Byte.valueOf(b10));
            linkedHashMap.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return linkedHashMap;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M W6(@NotNull short[] sArr, @NotNull M destination, @NotNull ed.l<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (short s10 : sArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Short.valueOf(s10));
            destination.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return destination;
    }

    @Xc.f
    public static final double W7(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr[2];
    }

    public static final int W8(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Short> W9(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = sArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (predicate.invoke(Short.valueOf(sArr[length])).booleanValue());
        return Vx(sArr, length + 1);
    }

    @NotNull
    public static final <T, R> List<Pair<T, R>> WA(@NotNull T[] tArr, @NotNull R[] other) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(tArr[i10], other[i10]));
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Long>> C Wa(@NotNull long[] jArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @Xc.f
    public static final Short Wb(short[] sArr, ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            short s10 = sArr[length];
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <R> List<R> Wc(int[] iArr, ed.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R Wd(@NotNull short[] sArr, R r10, @NotNull ed.p<? super Short, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = sArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Short.valueOf(sArr[length]), r10);
        }
        return r10;
    }

    @Xc.f
    public static final long We(long[] jArr, int i10, ed.l<? super Integer, Long> defaultValue) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= jArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).longValue() : jArr[i10];
    }

    public static final int Wf(@NotNull char[] cArr, char c10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @Xc.f
    public static final boolean Wg(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return !(zArr.length == 0);
    }

    public static final short Wh(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                short s10 = sArr[length];
                if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return s10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C Wi(@NotNull double[] dArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Double, ? extends R> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float Wj(short[] sArr, ed.l<? super Short, Float> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Short.valueOf(sArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Wk(long[] jArr, Comparator<? super R> comparator, ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char Wl(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Character.valueOf(c10));
            if (1 <= length) {
                while (true) {
                    char c11 = cArr[i10];
                    R rInvoke2 = selector.invoke(Character.valueOf(c11));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        c10 = c11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return c10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double Wm(boolean[] zArr, ed.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float Wn(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                float f11 = fArr[i10];
                if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) > 0) {
                    f10 = f11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @NotNull
    public static final Pair<List<Character>, List<Character>> Wo(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            } else {
                arrayList2.add(Character.valueOf(c10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean Wp(@NotNull boolean[] zArr, @NotNull ed.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i10])).booleanValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return zBooleanValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Long Wq(@NotNull long[] jArr, @NotNull ed.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = jArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        long jLongValue = jArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            jLongValue = operation.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i11]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Wr(float[] fArr, R r10, ed.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (fArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        for (float f10 : fArr) {
            r10 = operation.invoke(r10, Float.valueOf(f10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void Ws(@NotNull byte[] bArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        for (int length = bArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            byte b10 = bArr[length];
            bArr[length] = bArr[iQ];
            bArr[iQ] = b10;
        }
    }

    @Nullable
    public static final Short Wt(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> void Wu(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        C4875q.h4(tArr, Oc.g.x());
    }

    @NotNull
    public static final List<Long> Wv(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(...)");
        C4875q.Q3(jArrCopyOf);
        return Gr(jArrCopyOf);
    }

    @dd.j(name = "sumOfDouble")
    public static final double Ww(@NotNull Double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        double dDoubleValue = 0.0d;
        for (Double d10 : dArr) {
            dDoubleValue += d10.doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Boolean> Wx(@NotNull boolean[] zArr, int i10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= zArr.length) {
            return fz(zArr);
        }
        if (i10 == 1) {
            return H.l(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final int[] Wy(@NotNull Integer[] numArr) {
        kotlin.jvm.internal.G.p(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    @NotNull
    public static final Iterable<C4858c0<Integer>> Wz(@NotNull final int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.collections.y
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return C4957i.f(iArr);
            }
        });
    }

    public static Iterator X4(float[] fArr) {
        return C4957i.e(fArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> X5(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(cArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (char c10 : cArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(c10));
            linkedHashMap.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return linkedHashMap;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M X6(@NotNull boolean[] zArr, @NotNull M destination, @NotNull ed.l<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (boolean z10 : zArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Boolean.valueOf(z10));
            destination.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return destination;
    }

    @Xc.f
    public static final float X7(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr[2];
    }

    @Xc.f
    public static final int X8(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr.length;
    }

    @NotNull
    public static final List<Boolean> X9(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = zArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (predicate.invoke(Boolean.valueOf(zArr[length])).booleanValue());
        return Wx(zArr, length + 1);
    }

    @NotNull
    public static final <T, R, V> List<V> XA(@NotNull T[] tArr, @NotNull R[] other, @NotNull ed.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(tArr[i10], other[i10]));
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <T, C extends Collection<? super T>> C Xa(@NotNull T[] tArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), t10).booleanValue()) {
                destination.add(t10);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    public static byte Xb(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <R> List<R> Xc(long[] jArr, ed.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R Xd(@NotNull boolean[] zArr, R r10, @NotNull ed.p<? super Boolean, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = zArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Boolean.valueOf(zArr[length]), r10);
        }
        return r10;
    }

    @Xc.f
    public static final <T> T Xe(T[] tArr, int i10, ed.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= tArr.length) ? defaultValue.invoke(Integer.valueOf(i10)) : tArr[i10];
    }

    @InterfaceC4982o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @InterfaceC4852c0(expression = "indexOfFirst { it == element }", imports = {}))
    @InterfaceC4984p(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Xf(double[] dArr, double d10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (d10 == dArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <A extends Appendable> A Xg(@NotNull byte[] bArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Byte, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(buffer, "buffer");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean Xh(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[zArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C Xi(@NotNull float[] fArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Float, ? extends R> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float Xj(boolean[] zArr, ed.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Boolean.valueOf(zArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R> R Xk(T[] tArr, Comparator<? super R> comparator, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> double Xl(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d10 = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Double.valueOf(d10));
            if (1 <= length) {
                while (true) {
                    double d11 = dArr[i10];
                    R rInvoke2 = selector.invoke(Double.valueOf(d11));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        d10 = d11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return d10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Xm(byte[] bArr, ed.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Byte.valueOf(bArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Integer Xn(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i12)) > 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @NotNull
    public static final Pair<List<Double>, List<Double>> Xo(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            } else {
                arrayList2.add(Double.valueOf(d10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final byte Xp(@NotNull byte[] bArr, @NotNull ed.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return bByteValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S Xq(@NotNull T[] tArr, @NotNull ed.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = tArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        S sInvoke = (S) tArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            sInvoke = operation.invoke(Integer.valueOf(i11), (Object) tArr[i11], sInvoke);
        }
        return sInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Xr(int[] iArr, R r10, ed.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (iArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, Integer.valueOf(i10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void Xs(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        Ys(cArr, Random.f218007a);
    }

    @Nullable
    public static final Short Xt(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Short shValueOf = null;
        boolean z10 = false;
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                shValueOf = Short.valueOf(s10);
                z10 = true;
            }
        }
        if (z10) {
            return shValueOf;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final <T extends Comparable<? super T>> void Xu(@NotNull T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        C4875q.i4(tArr, Oc.g.x(), i10, i11);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> Xv(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return fw(tArr, Oc.g.x());
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final <T> double Xw(T[] tArr, ed.l<? super T, Double> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (T t10 : tArr) {
            dDoubleValue += selector.invoke(t10).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Byte> Xx(@NotNull byte[] bArr, int i10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = bArr.length;
        if (i10 >= length) {
            return Xy(bArr);
        }
        if (i10 == 1) {
            return H.l(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Byte.valueOf(bArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> Xy(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? hz(bArr) : H.l(Byte.valueOf(bArr[0])) : EmptyList.f217510a;
    }

    @NotNull
    public static final Iterable<C4858c0<Long>> Xz(@NotNull final long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.collections.v
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return C4957i.g(jArr);
            }
        });
    }

    public static Iterator Y4(double[] dArr) {
        return C4957i.d(dArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> Y5(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(dArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (double d10 : dArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Double.valueOf(d10));
            linkedHashMap.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <V> Map<Byte, V> Y6(byte[] bArr, ed.l<? super Byte, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int iJ = m0.j(bArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (byte b10 : bArr) {
            linkedHashMap.put(Byte.valueOf(b10), valueSelector.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final int Y7(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr[2];
    }

    public static final int Y8(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Byte> Y9(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (z10) {
                arrayList.add(Byte.valueOf(b10));
            } else if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Short, R>> YA(@NotNull short[] sArr, @NotNull Iterable<? extends R> other) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(Short.valueOf(sArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Short>> C Ya(@NotNull short[] sArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s10 = sArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Short.valueOf(s10)).booleanValue()) {
                destination.add(Short.valueOf(s10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    public static final byte Yb(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return b10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <T, R> List<R> Yc(T[] tArr, ed.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R Yd(@NotNull byte[] bArr, R r10, @NotNull ed.q<? super Integer, ? super Byte, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = bArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), Byte.valueOf(bArr[length]), r10);
        }
        return r10;
    }

    @Xc.f
    public static final short Ye(short[] sArr, int i10, ed.l<? super Integer, Short> defaultValue) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= sArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).shortValue() : sArr[i10];
    }

    @InterfaceC4982o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @InterfaceC4852c0(expression = "indexOfFirst { it == element }", imports = {}))
    @InterfaceC4984p(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Yf(float[] fArr, float f10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (f10 == fArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <A extends Appendable> A Yg(@NotNull char[] cArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Character, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(buffer, "buffer");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (char c10 : cArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Character.valueOf(c10)));
            } else {
                buffer.append(c10);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean Yh(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                boolean z10 = zArr[length];
                if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return z10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C Yi(@NotNull int[] iArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Yj(byte[] bArr, ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Yk(short[] sArr, Comparator<? super R> comparator, ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> float Yl(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f10 = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Float.valueOf(f10));
            if (1 <= length) {
                while (true) {
                    float f11 = fArr[i10];
                    R rInvoke2 = selector.invoke(Float.valueOf(f11));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        f10 = f11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return f10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Ym(char[] cArr, ed.l<? super Character, Float> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(cArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Long Yn(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) > 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @NotNull
    public static final Pair<List<Float>, List<Float>> Yo(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            } else {
                arrayList2.add(Float.valueOf(f10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final char Yp(@NotNull char[] cArr, @NotNull ed.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharValue), Character.valueOf(cArr[i10])).charValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return cCharValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Short Yq(@NotNull short[] sArr, @NotNull ed.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = sArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        short sShortValue = sArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            sShortValue = operation.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i11]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> Yr(long[] jArr, R r10, ed.p<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (jArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, Long.valueOf(j10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void Ys(@NotNull char[] cArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        for (int length = cArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            char c10 = cArr[length];
            cArr[length] = cArr[iQ];
            cArr[iQ] = c10;
        }
    }

    @NotNull
    public static final List<Byte> Yt(@NotNull byte[] bArr, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final void Yu(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length > 1) {
            C4875q.W3(sArr);
            xr(sArr);
        }
    }

    @NotNull
    public static final List<Short> Yv(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.G.o(sArrCopyOf, "copyOf(...)");
        C4875q.W3(sArrCopyOf);
        return Ir(sArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final double Yw(short[] sArr, ed.l<? super Short, Double> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s10 : sArr) {
            dDoubleValue += selector.invoke(Short.valueOf(s10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Character> Yx(@NotNull char[] cArr, int i10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = cArr.length;
        if (i10 >= length) {
            return Yy(cArr);
        }
        if (i10 == 1) {
            return H.l(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Character.valueOf(cArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> Yy(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? iz(cArr) : H.l(Character.valueOf(cArr[0])) : EmptyList.f217510a;
    }

    @NotNull
    public static final <T> Iterable<C4858c0<T>> Yz(@NotNull final T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.collections.x
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return C4956h.a(tArr);
            }
        });
    }

    public static Iterator Z4(short[] sArr) {
        return C4957i.h(sArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> Z5(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(fArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (float f10 : fArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Float.valueOf(f10));
            linkedHashMap.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <V> Map<Character, V> Z6(char[] cArr, ed.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int length = cArr.length;
        if (length > 128) {
            length = 128;
        }
        int iJ = m0.j(length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (char c10 : cArr) {
            linkedHashMap.put(Character.valueOf(c10), valueSelector.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final long Z7(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr[2];
    }

    @Xc.f
    public static final <T> int Z8(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr.length;
    }

    @NotNull
    public static final List<Character> Z9(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (char c10 : cArr) {
            if (z10) {
                arrayList.add(Character.valueOf(c10));
            } else if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> ZA(@NotNull short[] sArr, @NotNull Iterable<? extends R> other, @NotNull ed.p<? super Short, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Boolean>> C Za(@NotNull boolean[] zArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            boolean z10 = zArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    public static final char Zb(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <R> List<R> Zc(short[] sArr, ed.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R Zd(@NotNull char[] cArr, R r10, @NotNull ed.q<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = cArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), Character.valueOf(cArr[length]), r10);
        }
        return r10;
    }

    @Xc.f
    public static final boolean Ze(boolean[] zArr, int i10, ed.l<? super Integer, Boolean> defaultValue) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= zArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).booleanValue() : zArr[i10];
    }

    public static int Zf(@NotNull int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <A extends Appendable> A Zg(@NotNull double[] dArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Double, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(buffer, "buffer");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Double.valueOf(d10)));
            } else {
                buffer.append(String.valueOf(d10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static int Zh(@NotNull byte[] bArr, byte b10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (b10 == bArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C Zi(@NotNull long[] jArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Long, ? extends R> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R Zj(char[] cArr, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R Zk(boolean[] zArr, Comparator<? super R> comparator, ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> int Zl(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Integer.valueOf(i10));
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        i10 = i12;
                        rInvoke = rInvoke2;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float Zm(double[] dArr, ed.l<? super Double, Float> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Double.valueOf(dArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T> T Zn(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                T t11 = tArr[i10];
                if (comparator.compare(t10, t11) > 0) {
                    t10 = t11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @NotNull
    public static final Pair<List<Integer>, List<Integer>> Zo(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            } else {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final double Zp(@NotNull double[] dArr, @NotNull ed.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Boolean Zq(@NotNull boolean[] zArr, @NotNull ed.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = zArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zArr[i11]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> Zr(@NotNull T[] tArr, R r10, @NotNull ed.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (tArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        for (a.b bVar : tArr) {
            r10 = operation.invoke(r10, bVar);
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void Zs(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        at(dArr, Random.f218007a);
    }

    @NotNull
    public static final List<Byte> Zt(@NotNull byte[] bArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : C4875q.n(C4875q.f1(bArr, indices.f221139a, indices.f221140b + 1));
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void Zu(@NotNull short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        Arrays.sort(sArr, i10, i11);
        yr(sArr, i10, i11);
    }

    @NotNull
    public static final List<Byte> Zv(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Byte[] bArrN4 = C4875q.N4(bArr);
        C4875q.h4(bArrN4, comparator);
        return C4875q.t(bArrN4);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final double Zw(boolean[] zArr, ed.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z10 : zArr) {
            dDoubleValue += selector.invoke(Boolean.valueOf(z10)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Double> Zx(@NotNull double[] dArr, int i10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = dArr.length;
        if (i10 >= length) {
            return Zy(dArr);
        }
        if (i10 == 1) {
            return H.l(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Double.valueOf(dArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static List<Double> Zy(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? jz(dArr) : H.l(Double.valueOf(dArr[0])) : EmptyList.f217510a;
    }

    @NotNull
    public static final Iterable<C4858c0<Short>> Zz(@NotNull final short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.collections.s
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return C4957i.h(sArr);
            }
        });
    }

    public static Iterator a5(boolean[] zArr) {
        return C4957i.a(zArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> a6(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(iArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (int i10 : iArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Integer.valueOf(i10));
            linkedHashMap.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <V> Map<Double, V> a7(double[] dArr, ed.l<? super Double, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int iJ = m0.j(dArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (double d10 : dArr) {
            linkedHashMap.put(Double.valueOf(d10), valueSelector.invoke(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final <T> T a8(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr[2];
    }

    public static final <T> int a9(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final Iterable<C4858c0<Boolean>> aA(@NotNull final boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.collections.u
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return C4957i.a(zArr);
            }
        });
    }

    @NotNull
    public static final <R> List<Pair<Short, R>> aB(@NotNull short[] sArr, @NotNull R[] other) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            short s10 = sArr[i10];
            arrayList.add(new Pair(Short.valueOf(s10), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> aa(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (double d10 : dArr) {
            if (z10) {
                arrayList.add(Double.valueOf(d10));
            } else if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
                z10 = true;
            }
        }
        return arrayList;
    }

    public static final <R> List<R> ab(Object[] objArr) {
        kotlin.jvm.internal.G.p(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        if (objArr.length <= 0) {
            return arrayList;
        }
        Object obj = objArr[0];
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static final char ac(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return c10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <R> List<R> ad(boolean[] zArr, ed.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R ae(@NotNull double[] dArr, R r10, @NotNull ed.q<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = dArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), Double.valueOf(dArr[length]), r10);
        }
        return r10;
    }

    @Nullable
    public static final Boolean af(@NotNull boolean[] zArr, int i10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (i10 < 0 || i10 >= zArr.length) {
            return null;
        }
        return Boolean.valueOf(zArr[i10]);
    }

    public static int ag(@NotNull long[] jArr, long j10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <A extends Appendable> A ah(@NotNull float[] fArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Float, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(buffer, "buffer");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Float.valueOf(f10)));
            } else {
                buffer.append(String.valueOf(f10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final int ai(@NotNull char[] cArr, char c10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (c10 == cArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <T, R, C extends Collection<? super R>> C aj(@NotNull T[] tArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R ak(double[] dArr, ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Byte al(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (b10 < b11) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> long am(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Long.valueOf(j10));
            if (1 <= length) {
                while (true) {
                    long j11 = jArr[i10];
                    R rInvoke2 = selector.invoke(Long.valueOf(j11));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        j10 = j11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return j10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float an(float[] fArr, ed.l<? super Float, Float> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Float.valueOf(fArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Short ao(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) > 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @NotNull
    public static final Pair<List<Long>, List<Long>> ap(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            } else {
                arrayList2.add(Long.valueOf(j10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final float aq(@NotNull float[] fArr, @NotNull ed.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Byte ar(@NotNull byte[] bArr, @NotNull ed.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = bArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        byte bByteValue = bArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            bByteValue = operation.invoke(Byte.valueOf(bArr[i11]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> as(short[] sArr, R r10, ed.p<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (sArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, Short.valueOf(s10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void at(@NotNull double[] dArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        for (int length = dArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            double d10 = dArr[length];
            dArr[length] = dArr[iQ];
            dArr[iQ] = d10;
        }
    }

    @NotNull
    public static final List<Character> au(@NotNull char[] cArr, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> av(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        Byte[] bArrN4 = C4875q.N4(bArr);
        C4875q.U3(bArrN4);
        return C4875q.t(bArrN4);
    }

    @NotNull
    public static final List<Character> aw(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Character[] chArrO4 = C4875q.O4(cArr);
        C4875q.h4(chArrO4, comparator);
        return C4875q.t(chArrO4);
    }

    @dd.j(name = "sumOfFloat")
    public static final float ax(@NotNull Float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        float fFloatValue = 0.0f;
        for (Float f10 : fArr) {
            fFloatValue += f10.floatValue();
        }
        return fFloatValue;
    }

    @NotNull
    public static final List<Float> ay(@NotNull float[] fArr, int i10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = fArr.length;
        if (i10 >= length) {
            return az(fArr);
        }
        if (i10 == 1) {
            return H.l(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Float.valueOf(fArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> az(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? kz(fArr) : H.l(Float.valueOf(fArr[0])) : EmptyList.f217510a;
    }

    public static Iterator b5(byte[] bArr) {
        return C4957i.b(bArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> b6(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(jArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (long j10 : jArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Long.valueOf(j10));
            linkedHashMap.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <V> Map<Float, V> b7(float[] fArr, ed.l<? super Float, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int iJ = m0.j(fArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (float f10 : fArr) {
            linkedHashMap.put(Float.valueOf(f10), valueSelector.invoke(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final short b8(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr[2];
    }

    @Xc.f
    public static final int b9(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr.length;
    }

    public static final Iterator bA(Object[] objArr) {
        return C4956h.a(objArr);
    }

    @NotNull
    public static final <R, V> List<V> bB(@NotNull short[] sArr, @NotNull R[] other, @NotNull ed.p<? super Short, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> ba(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (float f10 : fArr) {
            if (z10) {
                arrayList.add(Float.valueOf(f10));
            } else if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @kotlin.C
    public static final <R, C extends Collection<? super R>> C bb(Object[] objArr, C destination) {
        kotlin.jvm.internal.G.p(objArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        if (objArr.length <= 0) {
            return destination;
        }
        Object obj = objArr[0];
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static final double bc(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <R, C extends Collection<? super R>> C bd(byte[] bArr, C destination, ed.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> R be(@NotNull float[] fArr, R r10, @NotNull ed.q<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = fArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), Float.valueOf(fArr[length]), r10);
        }
        return r10;
    }

    @Nullable
    public static final Byte bf(@NotNull byte[] bArr, int i10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (i10 < 0 || i10 >= bArr.length) {
            return null;
        }
        return Byte.valueOf(bArr[i10]);
    }

    public static <T> int bg(@NotNull T[] tArr, T t10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (t10.equals(tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <A extends Appendable> A bh(@NotNull int[] iArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Integer, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(buffer, "buffer");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Integer.valueOf(i12)));
            } else {
                buffer.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC4982o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @InterfaceC4852c0(expression = "indexOfLast { it == element }", imports = {}))
    @InterfaceC4984p(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int bi(double[] dArr, double d10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (d10 == dArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C bj(@NotNull short[] sArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Short, ? extends R> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R bk(float[] fArr, ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character bl(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                if (kotlin.jvm.internal.G.t(c10, c11) < 0) {
                    c10 = c11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T bm(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(t10);
            if (1 <= length) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float bn(int[] iArr, ed.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Integer.valueOf(iArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final byte bo(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) > 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> bp(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final int bq(@NotNull int[] iArr, @NotNull ed.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[0];
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character br(@NotNull char[] cArr, @NotNull ed.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = cArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        char cCharValue = cArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            cCharValue = operation.invoke(Character.valueOf(cArr[i11]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> bs(boolean[] zArr, R r10, ed.p<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (zArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        for (boolean z10 : zArr) {
            r10 = operation.invoke(r10, Boolean.valueOf(z10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void bt(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        ct(fArr, Random.f218007a);
    }

    @NotNull
    public static final List<Character> bu(@NotNull char[] cArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : C4875q.o(C4875q.g1(cArr, indices.f221139a, indices.f221140b + 1));
    }

    @NotNull
    public static final List<Character> bv(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        Character[] chArrO4 = C4875q.O4(cArr);
        C4875q.U3(chArrO4);
        return C4875q.t(chArrO4);
    }

    @NotNull
    public static final List<Double> bw(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Double[] dArrP4 = C4875q.P4(dArr);
        C4875q.h4(dArrP4, comparator);
        return C4875q.t(dArrP4);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final int bx(byte[] bArr, ed.l<? super Byte, Integer> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (byte b10 : bArr) {
            iIntValue += selector.invoke(Byte.valueOf(b10)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final List<Integer> bz(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? lz(iArr) : H.l(Integer.valueOf(iArr[0])) : EmptyList.f217510a;
    }

    public static Iterator c5(int[] iArr) {
        return C4957i.f(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, V> c6(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(tArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (a.b bVar : tArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(bVar);
            linkedHashMap.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <V> Map<Integer, V> c7(int[] iArr, ed.l<? super Integer, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int iJ = m0.j(iArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (int i10 : iArr) {
            linkedHashMap.put(Integer.valueOf(i10), valueSelector.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final boolean c8(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr[2];
    }

    public static final int c9(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    public static final Iterator cA(byte[] bArr) {
        return C4957i.b(bArr);
    }

    @NotNull
    public static final List<Pair<Short, Short>> cB(@NotNull short[] sArr, @NotNull short[] other) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(Short.valueOf(sArr[i10]), Short.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> ca(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (int i10 : iArr) {
            if (z10) {
                arrayList.add(Integer.valueOf(i10));
            } else if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> cb(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    public static final double cc(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return d10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <R, C extends Collection<? super R>> C cd(char[] cArr, C destination, ed.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> R ce(@NotNull int[] iArr, R r10, @NotNull ed.q<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = iArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), Integer.valueOf(iArr[length]), r10);
        }
        return r10;
    }

    @Nullable
    public static final Character cf(@NotNull char[] cArr, int i10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (i10 < 0 || i10 >= cArr.length) {
            return null;
        }
        return Character.valueOf(cArr[i10]);
    }

    public static int cg(@NotNull short[] sArr, short s10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <A extends Appendable> A ch(@NotNull long[] jArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Long, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(buffer, "buffer");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Long.valueOf(j10)));
            } else {
                buffer.append(String.valueOf(j10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC4982o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @InterfaceC4852c0(expression = "indexOfLast { it == element }", imports = {}))
    @InterfaceC4984p(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int ci(float[] fArr, float f10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (f10 == fArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C cj(@NotNull boolean[] zArr, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R ck(int[] iArr, ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T cl(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                T t11 = tArr[i10];
                if (t10.compareTo(t11) < 0) {
                    t10 = t11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> short cm(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Short.valueOf(s10));
            if (1 <= length) {
                while (true) {
                    short s11 = sArr[i10];
                    R rInvoke2 = selector.invoke(Short.valueOf(s11));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        s10 = s11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return s10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float cn(long[] jArr, ed.l<? super Long, Float> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Long.valueOf(jArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final char co(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) > 0) {
                    c10 = c11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return c10;
    }

    @NotNull
    public static final Pair<List<Short>, List<Short>> cp(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            } else {
                arrayList2.add(Short.valueOf(s10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final long cq(@NotNull long[] jArr, @NotNull ed.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return jLongValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double cr(@NotNull double[] dArr, @NotNull ed.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = dArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        double dDoubleValue = dArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            dDoubleValue = operation.invoke(Double.valueOf(dArr[i11]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> cs(byte[] bArr, R r10, ed.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (bArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Byte.valueOf(bArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void ct(@NotNull float[] fArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        for (int length = fArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            float f10 = fArr[length];
            fArr[length] = fArr[iQ];
            fArr[iQ] = f10;
        }
    }

    @NotNull
    public static final List<Double> cu(@NotNull double[] dArr, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> cv(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        Double[] dArrP4 = C4875q.P4(dArr);
        C4875q.U3(dArrP4);
        return C4875q.t(dArrP4);
    }

    @NotNull
    public static final List<Float> cw(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Float[] fArrQ4 = C4875q.Q4(fArr);
        C4875q.h4(fArrQ4, comparator);
        return C4875q.t(fArrQ4);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final int cx(char[] cArr, ed.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (char c10 : cArr) {
            iIntValue += selector.invoke(Character.valueOf(c10)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final List<Integer> cy(@NotNull int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = iArr.length;
        if (i10 >= length) {
            return bz(iArr);
        }
        if (i10 == 1) {
            return H.l(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Integer.valueOf(iArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> cz(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? mz(jArr) : H.l(Long.valueOf(jArr[0])) : EmptyList.f217510a;
    }

    public static final boolean d5(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> d6(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(sArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (short s10 : sArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Short.valueOf(s10));
            linkedHashMap.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <V> Map<Long, V> d7(long[] jArr, ed.l<? super Long, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int iJ = m0.j(jArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (long j10 : jArr) {
            linkedHashMap.put(Long.valueOf(j10), valueSelector.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final byte d8(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr[3];
    }

    @Xc.f
    public static final int d9(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr.length;
    }

    public static final Iterator dA(short[] sArr) {
        return C4957i.h(sArr);
    }

    @NotNull
    public static final <V> List<V> dB(@NotNull short[] sArr, @NotNull short[] other, @NotNull ed.p<? super Short, ? super Short, ? extends V> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), Short.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> da(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (long j10 : jArr) {
            if (z10) {
                arrayList.add(Long.valueOf(j10));
            } else if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> db(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    public static final float dc(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <R, C extends Collection<? super R>> C dd(double[] dArr, C destination, ed.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> R de(@NotNull long[] jArr, R r10, @NotNull ed.q<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = jArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), Long.valueOf(jArr[length]), r10);
        }
        return r10;
    }

    @Nullable
    public static final Double df(@NotNull double[] dArr, int i10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (i10 < 0 || i10 >= dArr.length) {
            return null;
        }
        return Double.valueOf(dArr[i10]);
    }

    public static final int dg(@NotNull boolean[] zArr, boolean z10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10 == zArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <T, A extends Appendable> A dh(@NotNull T[] tArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super T, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(buffer, "buffer");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            C5028u.b(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static int di(@NotNull int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @NotNull
    public static final <T, R> List<R> dj(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R dk(long[] jArr, ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double dl(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMax = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dMax = Math.max(dMax, dArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dMax);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> boolean dm(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z10 = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Boolean.valueOf(z10));
            if (1 <= length) {
                while (true) {
                    boolean z11 = zArr[i10];
                    R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        z10 = z11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return z10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> Float dn(T[] tArr, ed.l<? super T, Float> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(tArr[i10]).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final Pair<List<Boolean>, List<Boolean>> dp(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            } else {
                arrayList2.add(Boolean.valueOf(z10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <S, T extends S> S dq(@NotNull T[] tArr, @NotNull ed.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (Object) tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                sInvoke = operation.invoke(Integer.valueOf(i10), sInvoke, (Object) tArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float dr(@NotNull float[] fArr, @NotNull ed.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = fArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        float fFloatValue = fArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            fFloatValue = operation.invoke(Float.valueOf(fArr[i11]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> ds(char[] cArr, R r10, ed.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (cArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(cArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void dt(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        et(iArr, Random.f218007a);
    }

    @NotNull
    public static final List<Double> du(@NotNull double[] dArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : C4875q.p(C4875q.h1(dArr, indices.f221139a, indices.f221140b + 1));
    }

    @NotNull
    public static final List<Float> dv(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        Float[] fArrQ4 = C4875q.Q4(fArr);
        C4875q.U3(fArrQ4);
        return C4875q.t(fArrQ4);
    }

    @NotNull
    public static final List<Integer> dw(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Integer[] numArrR4 = C4875q.R4(iArr);
        C4875q.h4(numArrR4, comparator);
        return C4875q.t(numArrR4);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final int dx(double[] dArr, ed.l<? super Double, Integer> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (double d10 : dArr) {
            iIntValue += selector.invoke(Double.valueOf(d10)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final List<Long> dy(@NotNull long[] jArr, int i10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = jArr.length;
        if (i10 >= length) {
            return cz(jArr);
        }
        if (i10 == 1) {
            return H.l(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Long.valueOf(jArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> dz(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? nz(tArr) : H.l(tArr[0]) : EmptyList.f217510a;
    }

    public static final boolean e5(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> e6(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(zArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (boolean z10 : zArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Boolean.valueOf(z10));
            linkedHashMap.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <K, V> Map<K, V> e7(@NotNull K[] kArr, @NotNull ed.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(kArr, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int iJ = m0.j(kArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (K k10 : kArr) {
            linkedHashMap.put(k10, valueSelector.invoke(k10));
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final char e8(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr[3];
    }

    public static final int e9(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    public static final Iterator eA(int[] iArr) {
        return C4957i.f(iArr);
    }

    @NotNull
    public static final <R> List<Pair<Boolean, R>> eB(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> other) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(Boolean.valueOf(zArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> ea(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (T t10 : tArr) {
            if (z10) {
                arrayList.add(t10);
            } else if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> eb(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    public static final float ec(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return f10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <R, C extends Collection<? super R>> C ed(float[] fArr, C destination, ed.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R ee(@NotNull T[] tArr, R r10, @NotNull ed.q<? super Integer, ? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = tArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), tArr[length], r10);
        }
        return r10;
    }

    @Nullable
    public static final Float ef(@NotNull float[] fArr, int i10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (i10 < 0 || i10 >= fArr.length) {
            return null;
        }
        return Float.valueOf(fArr[i10]);
    }

    public static final int eg(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Byte.valueOf(bArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <A extends Appendable> A eh(@NotNull short[] sArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Short, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(buffer, "buffer");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Short.valueOf(s10)));
            } else {
                buffer.append(String.valueOf((int) s10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static int ei(@NotNull long[] jArr, long j10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (j10 == jArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <T, R, C extends Collection<? super R>> C ej(@NotNull T[] tArr, @NotNull C destination, @NotNull ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R extends Comparable<? super R>> R ek(T[] tArr, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double el(@NotNull Double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, dArr[i10].doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double em(byte[] bArr, ed.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Byte.valueOf(bArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float en(short[] sArr, ed.l<? super Short, Float> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Short.valueOf(sArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final double eo(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d10 = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                double d11 = dArr[i10];
                if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) > 0) {
                    d10 = d11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return d10;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final byte ep(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return fp(bArr, Random.f218007a);
    }

    public static final short eq(@NotNull short[] sArr, @NotNull ed.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return sShortValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Integer er(@NotNull int[] iArr, @NotNull ed.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = iArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        int iIntValue = iArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            iIntValue = operation.invoke(Integer.valueOf(iArr[i11]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> es(double[] dArr, R r10, ed.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (dArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Double.valueOf(dArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void et(@NotNull int[] iArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        for (int length = iArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            int i10 = iArr[length];
            iArr[length] = iArr[iQ];
            iArr[iQ] = i10;
        }
    }

    @NotNull
    public static final List<Float> eu(@NotNull float[] fArr, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> ev(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        Integer[] numArrR4 = C4875q.R4(iArr);
        C4875q.U3(numArrR4);
        return C4875q.t(numArrR4);
    }

    @NotNull
    public static final List<Long> ew(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Long[] lArrS4 = C4875q.S4(jArr);
        C4875q.h4(lArrS4, comparator);
        return C4875q.t(lArrS4);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final int ex(float[] fArr, ed.l<? super Float, Integer> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (float f10 : fArr) {
            iIntValue += selector.invoke(Float.valueOf(f10)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final <T> List<T> ey(@NotNull T[] tArr, int i10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = tArr.length;
        if (i10 >= length) {
            return dz(tArr);
        }
        if (i10 == 1) {
            return H.l(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> ez(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? oz(sArr) : H.l(Short.valueOf(sArr[0])) : EmptyList.f217510a;
    }

    public static final boolean f5(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K> Map<K, Byte> f6(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(bArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (byte b10 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b10)), Byte.valueOf(b10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <V> Map<Short, V> f7(short[] sArr, ed.l<? super Short, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int iJ = m0.j(sArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (short s10 : sArr) {
            linkedHashMap.put(Short.valueOf(s10), valueSelector.invoke(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final double f8(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr[3];
    }

    @NotNull
    public static final List<Byte> f9(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return U.a6(qz(bArr));
    }

    public static final Iterator fA(long[] jArr) {
        return C4957i.g(jArr);
    }

    @NotNull
    public static final <R, V> List<V> fB(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> other, @NotNull ed.p<? super Boolean, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> fa(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (short s10 : sArr) {
            if (z10) {
                arrayList.add(Short.valueOf(s10));
            } else if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> fb(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    public static int fc(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <R, C extends Collection<? super R>> C fd(int[] iArr, C destination, ed.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> R fe(@NotNull short[] sArr, R r10, @NotNull ed.q<? super Integer, ? super Short, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = sArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), Short.valueOf(sArr[length]), r10);
        }
        return r10;
    }

    @Nullable
    public static Integer ff(@NotNull int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static final int fg(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Character.valueOf(cArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <A extends Appendable> A fh(@NotNull boolean[] zArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Boolean, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(buffer, "buffer");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (boolean z10 : zArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Boolean.valueOf(z10)));
            } else {
                buffer.append(String.valueOf(z10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static <T> int fi(@NotNull T[] tArr, T t10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (t10.equals(tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C fj(@NotNull byte[] bArr, @NotNull C destination, @NotNull ed.l<? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (byte b10 : bArr) {
            destination.add(transform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R fk(short[] sArr, ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float fl(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fMax);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double fm(char[] cArr, ed.l<? super Character, Double> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(cArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float fn(boolean[] zArr, ed.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Boolean.valueOf(zArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final float fo(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f10 = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                float f11 = fArr[i10];
                if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) > 0) {
                    f10 = f11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return f10;
    }

    @InterfaceC4887e0(version = "1.3")
    public static final byte fp(@NotNull byte[] bArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (bArr.length != 0) {
            return bArr[random.q(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final boolean fq(@NotNull boolean[] zArr, @NotNull ed.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                zBooleanValue = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i10])).booleanValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return zBooleanValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Long fr(@NotNull long[] jArr, @NotNull ed.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = jArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        long jLongValue = jArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            jLongValue = operation.invoke(Long.valueOf(jArr[i11]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> fs(float[] fArr, R r10, ed.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (fArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Float.valueOf(fArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void ft(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        gt(jArr, Random.f218007a);
    }

    @NotNull
    public static final List<Float> fu(@NotNull float[] fArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : C4875q.q(C4875q.i1(fArr, indices.f221139a, indices.f221140b + 1));
    }

    @NotNull
    public static final List<Long> fv(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        Long[] lArrS4 = C4875q.S4(jArr);
        C4875q.U3(lArrS4);
        return C4875q.t(lArrS4);
    }

    @NotNull
    public static <T> List<T> fw(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return C4875q.t(yv(tArr, comparator));
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final int fx(int[] iArr, ed.l<? super Integer, Integer> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (int i10 : iArr) {
            iIntValue += selector.invoke(Integer.valueOf(i10)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final List<Short> fy(@NotNull short[] sArr, int i10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = sArr.length;
        if (i10 >= length) {
            return ez(sArr);
        }
        if (i10 == 1) {
            return H.l(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Short.valueOf(sArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> fz(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? pz(zArr) : H.l(Boolean.valueOf(zArr[0])) : EmptyList.f217510a;
    }

    public static final boolean g5(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> g6(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends K> keySelector, @NotNull ed.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(bArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (byte b10 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b10)), valueTransform.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <V> Map<Boolean, V> g7(boolean[] zArr, ed.l<? super Boolean, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int iJ = m0.j(zArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (boolean z10 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z10), valueSelector.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final float g8(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr[3];
    }

    @NotNull
    public static final List<Character> g9(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return U.a6(rz(cArr));
    }

    public static final Iterator gA(float[] fArr) {
        return C4957i.e(fArr);
    }

    @NotNull
    public static final <R> List<Pair<Boolean, R>> gB(@NotNull boolean[] zArr, @NotNull R[] other) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            boolean z10 = zArr[i10];
            arrayList.add(new Pair(Boolean.valueOf(z10), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> ga(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (z10) {
                arrayList.add(Boolean.valueOf(z11));
            } else if (!predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z11));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> gb(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    public static final int gc(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return i10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <R, C extends Collection<? super R>> C gd(long[] jArr, C destination, ed.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> R ge(@NotNull boolean[] zArr, R r10, @NotNull ed.q<? super Integer, ? super Boolean, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int length = zArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), Boolean.valueOf(zArr[length]), r10);
        }
        return r10;
    }

    @Nullable
    public static final Long gf(@NotNull long[] jArr, int i10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (i10 < 0 || i10 >= jArr.length) {
            return null;
        }
        return Long.valueOf(jArr[i10]);
    }

    public static final int gg(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Double.valueOf(dArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable gh(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) throws IOException {
        Xg(bArr, appendable, (i11 & 2) != 0 ? U6.j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static int gi(@NotNull short[] sArr, short s10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (s10 == sArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C gj(@NotNull char[] cArr, @NotNull C destination, @NotNull ed.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (char c10 : cArr) {
            destination.add(transform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R gk(boolean[] zArr, ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float gl(@NotNull Float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, fArr[i10].floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double gm(double[] dArr, ed.l<? super Double, Double> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Double.valueOf(dArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R gn(byte[] bArr, Comparator<? super R> comparator, ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final int go(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i12)) > 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final char gp(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return hp(cArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Boolean gq(@NotNull boolean[] zArr, @NotNull ed.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                zBooleanValue = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i10])).booleanValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S gr(@NotNull T[] tArr, @NotNull ed.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = tArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        S sInvoke = (S) tArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            sInvoke = operation.invoke((Object) tArr[i11], sInvoke);
        }
        return sInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> gs(int[] iArr, R r10, ed.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (iArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Integer.valueOf(iArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void gt(@NotNull long[] jArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        for (int length = jArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            long j10 = jArr[length];
            jArr[length] = jArr[iQ];
            jArr[iQ] = j10;
        }
    }

    @NotNull
    public static final List<Integer> gu(@NotNull int[] iArr, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> gv(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return C4875q.t(ov(tArr));
    }

    @NotNull
    public static final List<Short> gw(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Short[] shArrT4 = C4875q.T4(sArr);
        C4875q.h4(shArrT4, comparator);
        return C4875q.t(shArrT4);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final int gx(long[] jArr, ed.l<? super Long, Integer> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (long j10 : jArr) {
            iIntValue += selector.invoke(Long.valueOf(j10)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final List<Boolean> gy(@NotNull boolean[] zArr, int i10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = zArr.length;
        if (i10 >= length) {
            return fz(zArr);
        }
        if (i10 == 1) {
            return H.l(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Boolean.valueOf(zArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final long[] gz(@NotNull Long[] lArr) {
        kotlin.jvm.internal.G.p(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = lArr[i10].longValue();
        }
        return jArr;
    }

    public static final boolean h5(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K> Map<K, Character> h6(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(cArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (char c10 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c10)), Character.valueOf(c10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final <V, M extends Map<? super Byte, ? super V>> M h7(byte[] bArr, M destination, ed.l<? super Byte, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (byte b10 : bArr) {
            destination.put(Byte.valueOf(b10), valueSelector.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @Xc.f
    public static final int h8(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr[3];
    }

    @NotNull
    public static final List<Double> h9(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return U.a6(sz(dArr));
    }

    public static final Iterator hA(double[] dArr) {
        return C4957i.d(dArr);
    }

    @NotNull
    public static final <R, V> List<V> hB(@NotNull boolean[] zArr, @NotNull R[] other, @NotNull ed.p<? super Boolean, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @Xc.f
    public static final byte ha(byte[] bArr, int i10, ed.l<? super Integer, Byte> defaultValue) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= bArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).byteValue() : bArr[i10];
    }

    @NotNull
    public static final List<Long> hb(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    public static long hc(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <T, R, C extends Collection<? super R>> C hd(T[] tArr, C destination, ed.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final void he(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, L0> action) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (byte b10 : bArr) {
            action.invoke(Byte.valueOf(b10));
        }
    }

    @Nullable
    public static <T> T hf(@NotNull T[] tArr, int i10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    public static final int hg(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Float.valueOf(fArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable hh(char[] cArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) throws IOException {
        Yg(cArr, appendable, (i11 & 2) != 0 ? U6.j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static final int hi(@NotNull boolean[] zArr, boolean z10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (z10 == zArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C hj(@NotNull double[] dArr, @NotNull C destination, @NotNull ed.l<? super Double, ? extends R> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (double d10 : dArr) {
            destination.add(transform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R hk(byte[] bArr, ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Integer hl(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double hm(float[] fArr, ed.l<? super Float, Double> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Float.valueOf(fArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R hn(char[] cArr, Comparator<? super R> comparator, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final long ho(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) > 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.3")
    public static final char hp(@NotNull char[] cArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (cArr.length != 0) {
            return cArr[random.q(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Byte hq(@NotNull byte[] bArr, @NotNull ed.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(bByteValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Short hr(@NotNull short[] sArr, @NotNull ed.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = sArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        short sShortValue = sArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            sShortValue = operation.invoke(Short.valueOf(sArr[i11]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> hs(long[] jArr, R r10, ed.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (jArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Long.valueOf(jArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final <T> void ht(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        jt(tArr, Random.f218007a);
    }

    @NotNull
    public static final List<Integer> hu(@NotNull int[] iArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : C4875q.r(C4875q.j1(iArr, indices.f221139a, indices.f221140b + 1));
    }

    @NotNull
    public static final List<Short> hv(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        Short[] shArrT4 = C4875q.T4(sArr);
        C4875q.U3(shArrT4);
        return C4875q.t(shArrT4);
    }

    @NotNull
    public static final List<Boolean> hw(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Boolean[] boolArrM4 = C4875q.M4(zArr);
        C4875q.h4(boolArrM4, comparator);
        return C4875q.t(boolArrM4);
    }

    @dd.j(name = "sumOfInt")
    public static final int hx(@NotNull Integer[] numArr) {
        kotlin.jvm.internal.G.p(numArr, "<this>");
        int iIntValue = 0;
        for (Integer num : numArr) {
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final List<Byte> hy(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = bArr.length;
        do {
            length--;
            if (-1 >= length) {
                return Xy(bArr);
            }
        } while (predicate.invoke(Byte.valueOf(bArr[length])).booleanValue());
        return x9(bArr, length + 1);
    }

    @NotNull
    public static final List<Byte> hz(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static final boolean i5(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> i6(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends K> keySelector, @NotNull ed.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(cArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (char c10 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c10)), valueTransform.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final <V, M extends Map<? super Character, ? super V>> M i7(char[] cArr, M destination, ed.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (char c10 : cArr) {
            destination.put(Character.valueOf(c10), valueSelector.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @Xc.f
    public static final long i8(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr[3];
    }

    @NotNull
    public static final List<Float> i9(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return U.a6(tz(fArr));
    }

    public static final Iterator iA(boolean[] zArr) {
        return C4957i.a(zArr);
    }

    @NotNull
    public static final List<Pair<Boolean, Boolean>> iB(@NotNull boolean[] zArr, @NotNull boolean[] other) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(Boolean.valueOf(zArr[i10]), Boolean.valueOf(other[i10])));
        }
        return arrayList;
    }

    @Xc.f
    public static final char ia(char[] cArr, int i10, ed.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= cArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : cArr[i10];
    }

    @NotNull
    public static final <T> List<T> ib(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final long ic(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return j10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <R, C extends Collection<? super R>> C id(short[] sArr, C destination, ed.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final void ie(@NotNull char[] cArr, @NotNull ed.l<? super Character, L0> action) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (char c10 : cArr) {
            action.invoke(Character.valueOf(c10));
        }
    }

    public static final int ig(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable ih(double[] dArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) throws IOException {
        Zg(dArr, appendable, (i11 & 2) != 0 ? U6.j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    @Nullable
    public static final Boolean ii(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C ij(@NotNull float[] fArr, @NotNull C destination, @NotNull ed.l<? super Float, ? extends R> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (float f10 : fArr) {
            destination.add(transform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R ik(char[] cArr, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Long il(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (j10 < j11) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double im(int[] iArr, ed.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Integer.valueOf(iArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R in(double[] dArr, Comparator<? super R> comparator, ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final <T> T io(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                T t11 = tArr[i10];
                if (comparator.compare(t10, t11) > 0) {
                    t10 = t11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final double ip(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return jp(dArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character iq(@NotNull char[] cArr, @NotNull ed.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharValue), Character.valueOf(cArr[i10])).charValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharValue);
    }

    @NotNull
    public static final <T> T[] ir(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        for (T t10 : tArr) {
            if (t10 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> is(@NotNull T[] tArr, R r10, @NotNull ed.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (tArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, tArr[i10]);
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> iu(@NotNull long[] jArr, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final byte[] iv(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(...)");
        C4875q.G3(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    public static final Set<Byte> iw(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Byte> setQz = qz(bArr);
        N.J0(setQz, other);
        return setQz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final <T> int ix(T[] tArr, ed.l<? super T, Integer> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (T t10 : tArr) {
            iIntValue += selector.invoke(t10).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final List<Character> iy(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = cArr.length;
        do {
            length--;
            if (-1 >= length) {
                return Yy(cArr);
            }
        } while (predicate.invoke(Character.valueOf(cArr[length])).booleanValue());
        return y9(cArr, length + 1);
    }

    @NotNull
    public static final List<Character> iz(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static final <T> boolean j5(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K> Map<K, Double> j6(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(dArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (double d10 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d10)), Double.valueOf(d10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final <V, M extends Map<? super Double, ? super V>> M j7(double[] dArr, M destination, ed.l<? super Double, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (double d10 : dArr) {
            destination.put(Double.valueOf(d10), valueSelector.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @Xc.f
    public static final <T> T j8(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr[3];
    }

    @NotNull
    public static final List<Integer> j9(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return U.a6(uz(iArr));
    }

    public static final Iterator jA(char[] cArr) {
        return C4957i.c(cArr);
    }

    @NotNull
    public static final <V> List<V> jB(@NotNull boolean[] zArr, @NotNull boolean[] other, @NotNull ed.p<? super Boolean, ? super Boolean, ? extends V> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), Boolean.valueOf(other[i10])));
        }
        return arrayList;
    }

    @Xc.f
    public static final double ja(double[] dArr, int i10, ed.l<? super Integer, Double> defaultValue) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= dArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).doubleValue() : dArr[i10];
    }

    @NotNull
    public static final List<Short> jb(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    public static <T> T jc(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <R, C extends Collection<? super R>> C jd(boolean[] zArr, C destination, ed.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final void je(@NotNull double[] dArr, @NotNull ed.l<? super Double, L0> action) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (double d10 : dArr) {
            action.invoke(Double.valueOf(d10));
        }
    }

    @Nullable
    public static final Short jf(@NotNull short[] sArr, int i10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (i10 < 0 || i10 >= sArr.length) {
            return null;
        }
        return Short.valueOf(sArr[i10]);
    }

    public static final int jg(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Long.valueOf(jArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable jh(float[] fArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) throws IOException {
        ah(fArr, appendable, (i11 & 2) != 0 ? U6.j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    @Nullable
    public static final Boolean ji(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            boolean z10 = zArr[length];
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C jj(@NotNull int[] iArr, @NotNull C destination, @NotNull ed.l<? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (int i10 : iArr) {
            destination.add(transform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R jk(double[] dArr, ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Short jl(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (s10 < s11) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double jm(long[] jArr, ed.l<? super Long, Double> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Long.valueOf(jArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R jn(float[] fArr, Comparator<? super R> comparator, ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final short jo(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) > 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.3")
    public static final double jp(@NotNull double[] dArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (dArr.length != 0) {
            return dArr[random.q(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double jq(@NotNull double[] dArr, @NotNull ed.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    public static void jr(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = bArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[length2];
            bArr[length2] = b10;
            length2--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> js(short[] sArr, R r10, ed.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (sArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Short.valueOf(sArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final <T> void jt(@NotNull T[] tArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        for (int length = tArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            T t10 = tArr[length];
            tArr[length] = tArr[iQ];
            tArr[iQ] = t10;
        }
    }

    @NotNull
    public static final List<Long> ju(@NotNull long[] jArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : C4875q.s(C4875q.k1(jArr, indices.f221139a, indices.f221140b + 1));
    }

    @NotNull
    public static final char[] jv(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.G.o(cArrCopyOf, "copyOf(...)");
        C4875q.I3(cArrCopyOf);
        return cArrCopyOf;
    }

    @NotNull
    public static final Set<Character> jw(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Character> setRz = rz(cArr);
        N.J0(setRz, other);
        return setRz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final int jx(short[] sArr, ed.l<? super Short, Integer> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (short s10 : sArr) {
            iIntValue += selector.invoke(Short.valueOf(s10)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final List<Double> jy(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = dArr.length;
        do {
            length--;
            if (-1 >= length) {
                return Zy(dArr);
            }
        } while (predicate.invoke(Double.valueOf(dArr[length])).booleanValue());
        return z9(dArr, length + 1);
    }

    @NotNull
    public static final List<Double> jz(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static final boolean k5(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> k6(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends K> keySelector, @NotNull ed.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(dArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (double d10 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d10)), valueTransform.invoke(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final <V, M extends Map<? super Float, ? super V>> M k7(float[] fArr, M destination, ed.l<? super Float, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (float f10 : fArr) {
            destination.put(Float.valueOf(f10), valueSelector.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @Xc.f
    public static final short k8(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr[3];
    }

    @NotNull
    public static final List<Long> k9(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return U.a6(vz(jArr));
    }

    @NotNull
    public static final <R> List<Pair<Byte, R>> kA(@NotNull byte[] bArr, @NotNull Iterable<? extends R> other) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(Byte.valueOf(bArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @Xc.f
    public static final float ka(float[] fArr, int i10, ed.l<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= fArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).floatValue() : fArr[i10];
    }

    @NotNull
    public static final List<Boolean> kb(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    public static final <T> T kc(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedSequence")
    @kotlin.V
    public static final <T, R> List<R> kd(T[] tArr, ed.p<? super Integer, ? super T, ? extends InterfaceC5000m<? extends R>> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.t0(arrayList, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final void ke(@NotNull float[] fArr, @NotNull ed.l<? super Float, L0> action) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (float f10 : fArr) {
            action.invoke(Float.valueOf(f10));
        }
    }

    @NotNull
    public static final <K> Map<K, List<Byte>> kf(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(Byte.valueOf(b10));
        }
        return linkedHashMap;
    }

    public static final <T> int kg(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(tArr[i10]).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable kh(int[] iArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) throws IOException {
        bh(iArr, appendable, (i11 & 2) != 0 ? U6.j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    @Nullable
    public static final Byte ki(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C kj(@NotNull long[] jArr, @NotNull C destination, @NotNull ed.l<? super Long, ? extends R> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (long j10 : jArr) {
            destination.add(transform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R kk(float[] fArr, ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final byte kl(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (b10 < b11) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> double km(T[] tArr, ed.l<? super T, Double> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(tArr[i10]).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R kn(int[] iArr, Comparator<? super R> comparator, ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final boolean ko(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z10 = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                boolean z11 = zArr[i10];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) > 0) {
                    z10 = z11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return z10;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final float kp(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return lp(fArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float kq(@NotNull float[] fArr, @NotNull ed.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    public static void kr(@NotNull byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        AbstractC4859d.f217603a.d(i10, i11, bArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i13];
            bArr[i13] = b10;
            i13--;
            i10++;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> List<R> ks(boolean[] zArr, R r10, ed.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (zArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Boolean.valueOf(zArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void kt(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        lt(sArr, Random.f218007a);
    }

    @NotNull
    public static final <T> List<T> ku(@NotNull T[] tArr, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    @NotNull
    public static final double[] kv(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.G.o(dArrCopyOf, "copyOf(...)");
        C4875q.K3(dArrCopyOf);
        return dArrCopyOf;
    }

    @NotNull
    public static final Set<Double> kw(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Double> setSz = sz(dArr);
        N.J0(setSz, other);
        return setSz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final int kx(boolean[] zArr, ed.l<? super Boolean, Integer> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (boolean z10 : zArr) {
            iIntValue += selector.invoke(Boolean.valueOf(z10)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final List<Float> ky(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = fArr.length;
        do {
            length--;
            if (-1 >= length) {
                return az(fArr);
            }
        } while (predicate.invoke(Float.valueOf(fArr[length])).booleanValue());
        return A9(fArr, length + 1);
    }

    @NotNull
    public static final List<Float> kz(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final boolean l5(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K> Map<K, Float> l6(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(fArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (float f10 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f10)), Float.valueOf(f10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final <V, M extends Map<? super Integer, ? super V>> M l7(int[] iArr, M destination, ed.l<? super Integer, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (int i10 : iArr) {
            destination.put(Integer.valueOf(i10), valueSelector.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @Xc.f
    public static final boolean l8(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr[3];
    }

    @NotNull
    public static <T> List<T> l9(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return U.a6(wz(tArr));
    }

    @NotNull
    public static final <R, V> List<V> lA(@NotNull byte[] bArr, @NotNull Iterable<? extends R> other, @NotNull ed.p<? super Byte, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @Xc.f
    public static final int la(int[] iArr, int i10, ed.l<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= iArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).intValue() : iArr[i10];
    }

    @NotNull
    public static <T> List<T> lb(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        ArrayList arrayList = new ArrayList();
        mb(tArr, arrayList);
        return arrayList;
    }

    public static short lc(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedSequenceTo")
    @kotlin.V
    public static final <T, R, C extends Collection<? super R>> C ld(T[] tArr, C destination, ed.p<? super Integer, ? super T, ? extends InterfaceC5000m<? extends R>> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.t0(destination, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final void le(@NotNull int[] iArr, @NotNull ed.l<? super Integer, L0> action) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (int i10 : iArr) {
            action.invoke(Integer.valueOf(i10));
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> lf(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends K> keySelector, @NotNull ed.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    public static final int lg(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Short.valueOf(sArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable lh(long[] jArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) throws IOException {
        ch(jArr, appendable, (i11 & 2) != 0 ? U6.j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    @Nullable
    public static final Byte li(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            byte b10 = bArr[length];
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @kotlin.C
    @NotNull
    public static final <T, R, C extends Collection<? super R>> C lj(@NotNull T[] tArr, @NotNull C destination, @NotNull ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (T t10 : tArr) {
            destination.add(transform.invoke(t10));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R lk(int[] iArr, ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final char ll(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                if (kotlin.jvm.internal.G.t(c10, c11) < 0) {
                    c10 = c11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return c10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double lm(short[] sArr, ed.l<? super Short, Double> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Short.valueOf(sArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R ln(long[] jArr, Comparator<? super R> comparator, ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean lo(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.3")
    public static final float lp(@NotNull float[] fArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (fArr.length != 0) {
            return fArr[random.q(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Integer lq(@NotNull int[] iArr, @NotNull ed.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Integer.valueOf(iIntValue);
    }

    public static final void lr(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = cArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            char c10 = cArr[i10];
            cArr[i10] = cArr[length2];
            cArr[length2] = c10;
            length2--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Byte> ls(byte[] bArr, ed.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (bArr.length == 0) {
            return EmptyList.f217510a;
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void lt(@NotNull short[] sArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        for (int length = sArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            short s10 = sArr[length];
            sArr[length] = sArr[iQ];
            sArr[iQ] = s10;
        }
    }

    @NotNull
    public static <T> List<T> lu(@NotNull T[] tArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : C4875q.t(C4875q.l1(tArr, indices.f221139a, indices.f221140b + 1));
    }

    @NotNull
    public static final float[] lv(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.G.o(fArrCopyOf, "copyOf(...)");
        C4875q.M3(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final Set<Float> lw(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Float> setTz = tz(fArr);
        N.J0(setTz, other);
        return setTz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final long lx(byte[] bArr, ed.l<? super Byte, Long> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long jLongValue = 0;
        for (byte b10 : bArr) {
            jLongValue += selector.invoke(Byte.valueOf(b10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Integer> ly(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = iArr.length;
        do {
            length--;
            if (-1 >= length) {
                return bz(iArr);
            }
        } while (predicate.invoke(Integer.valueOf(iArr[length])).booleanValue());
        return B9(iArr, length + 1);
    }

    @NotNull
    public static List<Integer> lz(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static boolean m5(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @NotNull
    public static final <K, V> Map<K, V> m6(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends K> keySelector, @NotNull ed.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(fArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (float f10 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f10)), valueTransform.invoke(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final <V, M extends Map<? super Long, ? super V>> M m7(long[] jArr, M destination, ed.l<? super Long, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (long j10 : jArr) {
            destination.put(Long.valueOf(j10), valueSelector.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @Xc.f
    public static final byte m8(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr[4];
    }

    @NotNull
    public static final List<Short> m9(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return U.a6(xz(sArr));
    }

    @NotNull
    public static final List<Pair<Byte, Byte>> mA(@NotNull byte[] bArr, @NotNull byte[] other) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(Byte.valueOf(bArr[i10]), Byte.valueOf(other[i10])));
        }
        return arrayList;
    }

    @Xc.f
    public static final long ma(long[] jArr, int i10, ed.l<? super Integer, Long> defaultValue) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= jArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).longValue() : jArr[i10];
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super T>, T> C mb(@NotNull T[] tArr, @NotNull C destination) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static final short mc(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return s10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @dd.j(name = "flatMapSequence")
    @NotNull
    @kotlin.V
    public static final <T, R> List<R> md(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends InterfaceC5000m<? extends R>> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            N.t0(arrayList, transform.invoke(t10));
        }
        return arrayList;
    }

    public static final void me(@NotNull long[] jArr, @NotNull ed.l<? super Long, L0> action) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (long j10 : jArr) {
            action.invoke(Long.valueOf(j10));
        }
    }

    @NotNull
    public static final <K> Map<K, List<Character>> mf(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(Character.valueOf(c10));
        }
        return linkedHashMap;
    }

    public static final int mg(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Boolean.valueOf(zArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable mh(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) throws IOException {
        dh(objArr, appendable, (i11 & 2) != 0 ? U6.j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    @Nullable
    public static final Character mi(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C mj(@NotNull short[] sArr, @NotNull C destination, @NotNull ed.l<? super Short, ? extends R> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (short s10 : sArr) {
            destination.add(transform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R mk(long[] jArr, ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final double ml(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dMax = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dMax = Math.max(dMax, dArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dMax;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double mm(boolean[] zArr, ed.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R> R mn(T[] tArr, Comparator<? super R> comparator, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean mo(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final int mp(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return np(iArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Long mq(@NotNull long[] jArr, @NotNull ed.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(jLongValue);
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void mr(@NotNull char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        AbstractC4859d.f217603a.d(i10, i11, cArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            char c10 = cArr[i10];
            cArr[i10] = cArr[i13];
            cArr[i13] = c10;
            i13--;
            i10++;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Character> ms(char[] cArr, ed.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (cArr.length == 0) {
            return EmptyList.f217510a;
        }
        char c10 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c10));
        int length = cArr.length;
        int i10 = 1;
        while (i10 < length) {
            Character chInvoke = operation.invoke(Character.valueOf(c10), Character.valueOf(cArr[i10]));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i10++;
            c10 = cCharValue;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void mt(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        nt(zArr, Random.f218007a);
    }

    @NotNull
    public static final List<Short> mu(@NotNull short[] sArr, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final int[] mv(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(...)");
        C4875q.O3(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static final Set<Integer> mw(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Integer> setUz = uz(iArr);
        N.J0(setUz, other);
        return setUz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final long mx(char[] cArr, ed.l<? super Character, Long> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long jLongValue = 0;
        for (char c10 : cArr) {
            jLongValue += selector.invoke(Character.valueOf(c10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Long> my(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = jArr.length;
        do {
            length--;
            if (-1 >= length) {
                return cz(jArr);
            }
        } while (predicate.invoke(Long.valueOf(jArr[length])).booleanValue());
        return C9(jArr, length + 1);
    }

    @NotNull
    public static final List<Long> mz(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static final boolean n5(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K> Map<K, Integer> n6(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(iArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (int i10 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i10)), Integer.valueOf(i10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M n7(@NotNull K[] kArr, @NotNull M destination, @NotNull ed.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(kArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (K k10 : kArr) {
            destination.put(k10, valueSelector.invoke(k10));
        }
        return destination;
    }

    @Xc.f
    public static final char n8(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr[4];
    }

    @NotNull
    public static final List<Boolean> n9(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return U.a6(yz(zArr));
    }

    @NotNull
    public static final <V> List<V> nA(@NotNull byte[] bArr, @NotNull byte[] other, @NotNull ed.p<? super Byte, ? super Byte, ? extends V> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), Byte.valueOf(other[i10])));
        }
        return arrayList;
    }

    @Xc.f
    public static final <T> T na(T[] tArr, int i10, ed.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= tArr.length) ? defaultValue.invoke(Integer.valueOf(i10)) : tArr[i10];
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Byte>> C nb(@NotNull byte[] bArr, @NotNull C destination, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
        }
        return destination;
    }

    public static final boolean nc(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @dd.j(name = "flatMapSequenceTo")
    @NotNull
    @kotlin.V
    public static final <T, R, C extends Collection<? super R>> C nd(@NotNull T[] tArr, @NotNull C destination, @NotNull ed.l<? super T, ? extends InterfaceC5000m<? extends R>> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (T t10 : tArr) {
            N.t0(destination, transform.invoke(t10));
        }
        return destination;
    }

    public static final <T> void ne(@NotNull T[] tArr, @NotNull ed.l<? super T, L0> action) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (T t10 : tArr) {
            action.invoke(t10);
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> nf(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends K> keySelector, @NotNull ed.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    public static final int ng(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable nh(short[] sArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) throws IOException {
        eh(sArr, appendable, (i11 & 2) != 0 ? U6.j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    @Nullable
    public static final Character ni(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char c10 = cArr[length];
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C nj(@NotNull boolean[] zArr, @NotNull C destination, @NotNull ed.l<? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (boolean z10 : zArr) {
            destination.add(transform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R extends Comparable<? super R>> R nk(T[] tArr, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final double nl(@NotNull Double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, dArr[i10].doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float nm(byte[] bArr, ed.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Byte.valueOf(bArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R nn(short[] sArr, Comparator<? super R> comparator, ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean no(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.3")
    public static final int np(@NotNull int[] iArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (iArr.length != 0) {
            return iArr[random.q(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S nq(@NotNull T[] tArr, @NotNull ed.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (Object) tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                sInvoke = operation.invoke(Integer.valueOf(i10), sInvoke, (Object) tArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    public static final void nr(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = dArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            double d10 = dArr[i10];
            dArr[i10] = dArr[length2];
            dArr[length2] = d10;
            length2--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Double> ns(double[] dArr, ed.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (dArr.length == 0) {
            return EmptyList.f217510a;
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void nt(@NotNull boolean[] zArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        for (int length = zArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            boolean z10 = zArr[length];
            zArr[length] = zArr[iQ];
            zArr[iQ] = z10;
        }
    }

    @NotNull
    public static final List<Short> nu(@NotNull short[] sArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : C4875q.u(C4875q.m1(sArr, indices.f221139a, indices.f221140b + 1));
    }

    @NotNull
    public static final long[] nv(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(...)");
        C4875q.Q3(jArrCopyOf);
        return jArrCopyOf;
    }

    @NotNull
    public static final Set<Long> nw(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Long> setVz = vz(jArr);
        N.J0(setVz, other);
        return setVz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final long nx(double[] dArr, ed.l<? super Double, Long> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long jLongValue = 0;
        for (double d10 : dArr) {
            jLongValue += selector.invoke(Double.valueOf(d10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final <T> List<T> ny(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = tArr.length;
        do {
            length--;
            if (-1 >= length) {
                return dz(tArr);
            }
        } while (predicate.invoke(tArr[length]).booleanValue());
        return D9(tArr, length + 1);
    }

    @NotNull
    public static <T> List<T> nz(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return new ArrayList(I.v(tArr, false, 1, null));
    }

    public static final boolean o5(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @NotNull
    public static final <K, V> Map<K, V> o6(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends K> keySelector, @NotNull ed.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(iArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (int i10 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i10)), valueTransform.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final <V, M extends Map<? super Short, ? super V>> M o7(short[] sArr, M destination, ed.l<? super Short, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (short s10 : sArr) {
            destination.put(Short.valueOf(s10), valueSelector.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    @Xc.f
    public static final double o8(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr[4];
    }

    @NotNull
    public static final <K> List<Byte> o9(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends K> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (hashSet.add(selector.invoke(Byte.valueOf(b10)))) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Byte, R>> oA(@NotNull byte[] bArr, @NotNull R[] other) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte b10 = bArr[i10];
            arrayList.add(new Pair(Byte.valueOf(b10), other[i10]));
        }
        return arrayList;
    }

    @Xc.f
    public static final short oa(short[] sArr, int i10, ed.l<? super Integer, Short> defaultValue) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= sArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).shortValue() : sArr[i10];
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Character>> C ob(@NotNull char[] cArr, @NotNull C destination, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
        }
        return destination;
    }

    public static final boolean oc(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return z10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C od(@NotNull byte[] bArr, @NotNull C destination, @NotNull ed.l<? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (byte b10 : bArr) {
            N.s0(destination, transform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    public static final void oe(@NotNull short[] sArr, @NotNull ed.l<? super Short, L0> action) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (short s10 : sArr) {
            action.invoke(Short.valueOf(s10));
        }
    }

    @NotNull
    public static final <K> Map<K, List<Double>> of(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(Double.valueOf(d10));
        }
        return linkedHashMap;
    }

    public static final int og(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable oh(boolean[] zArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) throws IOException {
        fh(zArr, appendable, (i11 & 2) != 0 ? U6.j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    @Nullable
    public static final Double oi(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean oj(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (length == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        if (1 <= length) {
            while (true) {
                boolean z11 = zArr[i10];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R ok(short[] sArr, ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final float ol(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMax = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fMax;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float om(char[] cArr, ed.l<? super Character, Float> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(cArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R on(boolean[] zArr, Comparator<? super R> comparator, ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean oo(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final long op(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return pp(jArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Short oq(@NotNull short[] sArr, @NotNull ed.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(sShortValue);
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void or(@NotNull double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        AbstractC4859d.f217603a.d(i10, i11, dArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            double d10 = dArr[i10];
            dArr[i10] = dArr[i13];
            dArr[i13] = d10;
            i13--;
            i10++;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Float> os(float[] fArr, ed.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (fArr.length == 0) {
            return EmptyList.f217510a;
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    public static byte ot(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final List<Boolean> ou(@NotNull boolean[] zArr, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] ov(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        C4875q.U3(tArr2);
        return tArr2;
    }

    @NotNull
    public static final <T> Set<T> ow(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Collection collectionV0 = N.v0(other);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t10 : tArr) {
            if (!collectionV0.contains(t10)) {
                linkedHashSet.add(t10);
            }
        }
        return linkedHashSet;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final long ox(float[] fArr, ed.l<? super Float, Long> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long jLongValue = 0;
        for (float f10 : fArr) {
            jLongValue += selector.invoke(Float.valueOf(f10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Short> oy(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = sArr.length;
        do {
            length--;
            if (-1 >= length) {
                return ez(sArr);
            }
        } while (predicate.invoke(Short.valueOf(sArr[length])).booleanValue());
        return E9(sArr, length + 1);
    }

    @NotNull
    public static final List<Short> oz(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static final boolean p5(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K> Map<K, Long> p6(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(jArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (long j10 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j10)), Long.valueOf(j10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final <V, M extends Map<? super Boolean, ? super V>> M p7(boolean[] zArr, M destination, ed.l<? super Boolean, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (boolean z10 : zArr) {
            destination.put(Boolean.valueOf(z10), valueSelector.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @Xc.f
    public static final float p8(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr[4];
    }

    @NotNull
    public static final <K> List<Character> p9(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends K> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (hashSet.add(selector.invoke(Character.valueOf(c10)))) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> pA(@NotNull byte[] bArr, @NotNull R[] other, @NotNull ed.p<? super Byte, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @Xc.f
    public static final boolean pa(boolean[] zArr, int i10, ed.l<? super Integer, Boolean> defaultValue) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= zArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).booleanValue() : zArr[i10];
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Double>> C pb(@NotNull double[] dArr, @NotNull C destination, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                destination.add(Double.valueOf(d10));
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <T, R> R pc(T[] tArr, ed.l<? super T, ? extends R> transform) {
        R rInvoke;
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                rInvoke = transform.invoke(tArr[i10]);
                if (rInvoke != null) {
                    break;
                }
                i10++;
            } else {
                rInvoke = null;
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C pd(@NotNull char[] cArr, @NotNull C destination, @NotNull ed.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (char c10 : cArr) {
            N.s0(destination, transform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    public static final void pe(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, L0> action) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (boolean z10 : zArr) {
            action.invoke(Boolean.valueOf(z10));
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> pf(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends K> keySelector, @NotNull ed.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    public static final int pg(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @NotNull
    public static final String ph(@NotNull byte[] bArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Byte, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        Xg(bArr, sb2, separator, prefix, postfix, i10, truncated, lVar);
        return sb2.toString();
    }

    @Nullable
    public static final Double pi(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            double d10 = dArr[length];
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte pj(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (length == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R pk(boolean[] zArr, ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final float pl(@NotNull Float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = fArr[0].floatValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, fArr[i10].floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float pm(double[] dArr, ed.l<? super Double, Float> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Double.valueOf(dArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R pn(byte[] bArr, Comparator<? super R> comparator, ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean po(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.3")
    public static final long pp(@NotNull long[] jArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (jArr.length != 0) {
            return jArr[random.q(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Boolean pq(@NotNull boolean[] zArr, @NotNull ed.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i10])).booleanValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final void pr(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = fArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            float f10 = fArr[i10];
            fArr[i10] = fArr[length2];
            fArr[length2] = f10;
            length2--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Integer> ps(int[] iArr, ed.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (iArr.length == 0) {
            return EmptyList.f217510a;
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    public static final byte pt(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Byte bValueOf = null;
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                bValueOf = Byte.valueOf(b10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.G.n(bValueOf, "null cannot be cast to non-null type kotlin.Byte");
        return bValueOf.byteValue();
    }

    @NotNull
    public static final List<Boolean> pu(@NotNull boolean[] zArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : C4875q.v(C4875q.n1(zArr, indices.f221139a, indices.f221140b + 1));
    }

    @NotNull
    public static final short[] pv(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.G.o(sArrCopyOf, "copyOf(...)");
        C4875q.W3(sArrCopyOf);
        return sArrCopyOf;
    }

    @NotNull
    public static final Set<Short> pw(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Short> setXz = xz(sArr);
        N.J0(setXz, other);
        return setXz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final long px(int[] iArr, ed.l<? super Integer, Long> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long jLongValue = 0;
        for (int i10 : iArr) {
            jLongValue += selector.invoke(Integer.valueOf(i10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Boolean> py(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = zArr.length;
        do {
            length--;
            if (-1 >= length) {
                return fz(zArr);
            }
        } while (predicate.invoke(Boolean.valueOf(zArr[length])).booleanValue());
        return F9(zArr, length + 1);
    }

    @NotNull
    public static final List<Boolean> pz(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final boolean q5(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @NotNull
    public static final <K, V> Map<K, V> q6(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends K> keySelector, @NotNull ed.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(jArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (long j10 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j10)), valueTransform.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    public static final double q7(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (byte b10 : bArr) {
            d10 += (double) b10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @Xc.f
    public static final int q8(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr[4];
    }

    @NotNull
    public static final <K> List<Double> q9(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends K> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (hashSet.add(selector.invoke(Double.valueOf(d10)))) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Character, R>> qA(@NotNull char[] cArr, @NotNull Iterable<? extends R> other) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(Character.valueOf(cArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @Xc.f
    public static final Boolean qa(boolean[] zArr, int i10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return af(zArr, i10);
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Float>> C qb(@NotNull float[] fArr, @NotNull C destination, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                destination.add(Float.valueOf(f10));
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <T, R> R qc(T[] tArr, ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C qd(@NotNull double[] dArr, @NotNull C destination, @NotNull ed.l<? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (double d10 : dArr) {
            N.s0(destination, transform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    public static final void qe(@NotNull byte[] bArr, @NotNull ed.p<? super Integer, ? super Byte, L0> action) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final <K> Map<K, List<Float>> qf(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(Float.valueOf(f10));
        }
        return linkedHashMap;
    }

    public static final int qg(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @NotNull
    public static final String qh(@NotNull char[] cArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Character, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        Yg(cArr, sb2, separator, prefix, postfix, i10, truncated, lVar);
        return sb2.toString();
    }

    @Nullable
    public static final Float qi(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character qj(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (length == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double qk(byte[] bArr, ed.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Byte.valueOf(bArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static int ql(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float qm(float[] fArr, ed.l<? super Float, Float> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Float.valueOf(fArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R qn(char[] cArr, Comparator<? super R> comparator, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean qo(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <T> T qp(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return (T) rp(tArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Byte qq(@NotNull byte[] bArr, @NotNull ed.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(bByteValue);
    }

    @InterfaceC4887e0(version = "1.4")
    public static final void qr(@NotNull float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        AbstractC4859d.f217603a.d(i10, i11, fArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            float f10 = fArr[i10];
            fArr[i10] = fArr[i13];
            fArr[i13] = f10;
            i13--;
            i10++;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Long> qs(long[] jArr, ed.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (jArr.length == 0) {
            return EmptyList.f217510a;
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    public static char qt(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static byte[] qu(@NotNull byte[] bArr, @NotNull Collection<Integer> indices) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr2[i10] = bArr[it.next().intValue()];
            i10++;
        }
        return bArr2;
    }

    @NotNull
    public static final byte[] qv(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(...)");
        Ku(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    public static final Set<Boolean> qw(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Boolean> setYz = yz(zArr);
        N.J0(setYz, other);
        return setYz;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final long qx(long[] jArr, ed.l<? super Long, Long> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long jLongValue = 0;
        for (long j10 : jArr) {
            jLongValue += selector.invoke(Long.valueOf(j10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Byte> qy(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Byte> qz(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(bArr.length));
        Cy(bArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final boolean r5(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <T, K> Map<K, T> r6(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(tArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (T t10 : tArr) {
            linkedHashMap.put(keySelector.invoke(t10), t10);
        }
        return linkedHashMap;
    }

    public static final double r7(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (double d11 : dArr) {
            d10 += d11;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @Xc.f
    public static final long r8(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr[4];
    }

    @NotNull
    public static final <K> List<Float> r9(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends K> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (hashSet.add(selector.invoke(Float.valueOf(f10)))) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> rA(@NotNull char[] cArr, @NotNull Iterable<? extends R> other, @NotNull ed.p<? super Character, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @Xc.f
    public static final Byte ra(byte[] bArr, int i10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bf(bArr, i10);
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Integer>> C rb(@NotNull int[] iArr, @NotNull C destination, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                destination.add(Integer.valueOf(i10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Boolean rc(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C rd(@NotNull float[] fArr, @NotNull C destination, @NotNull ed.l<? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (float f10 : fArr) {
            N.s0(destination, transform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    public static final void re(@NotNull char[] cArr, @NotNull ed.p<? super Integer, ? super Character, L0> action) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> rf(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends K> keySelector, @NotNull ed.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    public static final int rg(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @NotNull
    public static final String rh(@NotNull double[] dArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Double, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        Zg(dArr, sb2, separator, prefix, postfix, i10, truncated, lVar);
        return sb2.toString();
    }

    @Nullable
    public static final Float ri(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            float f10 = fArr[length];
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double rj(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (length == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        if (1 <= length) {
            while (true) {
                double d11 = dArr[i10];
                R rInvoke2 = selector.invoke(Double.valueOf(d11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d10 = d11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double rk(char[] cArr, ed.l<? super Character, Double> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(cArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final long rl(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (j10 < j11) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float rm(int[] iArr, ed.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Integer.valueOf(iArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R rn(double[] dArr, Comparator<? super R> comparator, ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean ro(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.3")
    public static final <T> T rp(@NotNull T[] tArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (tArr.length != 0) {
            return tArr[random.q(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character rq(@NotNull char[] cArr, @NotNull ed.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i10])).charValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharValue);
    }

    public static void rr(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = iArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[length2];
            iArr[length2] = i11;
            length2--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> rs(@NotNull T[] tArr, @NotNull ed.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (tArr.length == 0) {
            return EmptyList.f217510a;
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[i10]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    public static final char rt(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                chValueOf = Character.valueOf(c10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.G.n(chValueOf, "null cannot be cast to non-null type kotlin.Char");
        return chValueOf.charValue();
    }

    @NotNull
    public static byte[] ru(@NotNull byte[] bArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? new byte[0] : C4875q.f1(bArr, indices.f221139a, indices.f221140b + 1);
    }

    @NotNull
    public static final char[] rv(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.G.o(cArrCopyOf, "copyOf(...)");
        Mu(cArrCopyOf);
        return cArrCopyOf;
    }

    public static final double rw(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        double d10 = 0.0d;
        for (double d11 : dArr) {
            d10 += d11;
        }
        return d10;
    }

    @dd.j(name = "sumOfLong")
    public static final long rx(@NotNull Long[] lArr) {
        kotlin.jvm.internal.G.p(lArr, "<this>");
        long jLongValue = 0;
        for (Long l10 : lArr) {
            jLongValue += l10.longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Character> ry(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Character> rz(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        int length = cArr.length;
        if (length > 128) {
            length = 128;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(length));
        Dy(cArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final boolean s5(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @NotNull
    public static final <T, K, V> Map<K, V> s6(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends K> keySelector, @NotNull ed.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(tArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (T t10 : tArr) {
            linkedHashMap.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    public static final double s7(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (float f10 : fArr) {
            d10 += (double) f10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @Xc.f
    public static final <T> T s8(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr[4];
    }

    @NotNull
    public static final <K> List<Integer> s9(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends K> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (hashSet.add(selector.invoke(Integer.valueOf(i10)))) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Character, Character>> sA(@NotNull char[] cArr, @NotNull char[] other) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(Character.valueOf(cArr[i10]), Character.valueOf(other[i10])));
        }
        return arrayList;
    }

    @Xc.f
    public static final Character sa(char[] cArr, int i10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cf(cArr, i10);
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Long>> C sb(@NotNull long[] jArr, @NotNull C destination, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Boolean sc(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C sd(@NotNull int[] iArr, @NotNull C destination, @NotNull ed.l<? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (int i10 : iArr) {
            N.s0(destination, transform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    public static final void se(@NotNull double[] dArr, @NotNull ed.p<? super Integer, ? super Double, L0> action) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final <K> Map<K, List<Integer>> sf(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(Integer.valueOf(i10));
        }
        return linkedHashMap;
    }

    public static final int sg(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @NotNull
    public static final String sh(@NotNull float[] fArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Float, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        ah(fArr, sb2, separator, prefix, postfix, i10, truncated, lVar);
        return sb2.toString();
    }

    @Nullable
    public static final Integer si(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float sj(@NotNull float[] fArr, @NotNull ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (length == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        if (1 <= length) {
            while (true) {
                float f11 = fArr[i10];
                R rInvoke2 = selector.invoke(Float.valueOf(f11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f10 = f11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double sk(double[] dArr, ed.l<? super Double, Double> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Double.valueOf(dArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T sl(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                T t11 = tArr[i10];
                if (t10.compareTo(t11) < 0) {
                    t10 = t11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float sm(long[] jArr, ed.l<? super Long, Float> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Long.valueOf(jArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R sn(float[] fArr, Comparator<? super R> comparator, ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean so(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final short sp(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return tp(sArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double sq(@NotNull double[] dArr, @NotNull ed.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    public static void sr(@NotNull int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        AbstractC4859d.f217603a.d(i10, i11, iArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            int i14 = iArr[i10];
            iArr[i10] = iArr[i13];
            iArr[i13] = i14;
            i13--;
            i10++;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Short> ss(short[] sArr, ed.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (sArr.length == 0) {
            return EmptyList.f217510a;
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    public static final double st(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final char[] su(@NotNull char[] cArr, @NotNull Collection<Integer> indices) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            cArr2[i10] = cArr[it.next().intValue()];
            i10++;
        }
        return cArr2;
    }

    @NotNull
    public static final double[] sv(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.G.o(dArrCopyOf, "copyOf(...)");
        Ou(dArrCopyOf);
        return dArrCopyOf;
    }

    public static final float sw(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final <T> long sx(T[] tArr, ed.l<? super T, Long> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long jLongValue = 0;
        for (T t10 : tArr) {
            jLongValue += selector.invoke(t10).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Double> sy(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Double> sz(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(dArr.length));
        Ey(dArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final boolean t5(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K> Map<K, Short> t6(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(sArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (short s10 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s10)), Short.valueOf(s10));
        }
        return linkedHashMap;
    }

    public static final double t7(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (int i11 : iArr) {
            d10 += (double) i11;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @Xc.f
    public static final short t8(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr[4];
    }

    @NotNull
    public static final <K> List<Long> t9(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends K> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (hashSet.add(selector.invoke(Long.valueOf(j10)))) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> tA(@NotNull char[] cArr, @NotNull char[] other, @NotNull ed.p<? super Character, ? super Character, ? extends V> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), Character.valueOf(other[i10])));
        }
        return arrayList;
    }

    @Xc.f
    public static final Double ta(double[] dArr, int i10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return df(dArr, i10);
    }

    @kotlin.C
    @NotNull
    public static final <T, C extends Collection<? super T>> C tb(@NotNull T[] tArr, @NotNull C destination, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @Nullable
    public static final Byte tc(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C td(@NotNull long[] jArr, @NotNull C destination, @NotNull ed.l<? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (long j10 : jArr) {
            N.s0(destination, transform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    public static final void te(@NotNull float[] fArr, @NotNull ed.p<? super Integer, ? super Float, L0> action) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> tf(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends K> keySelector, @NotNull ed.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    public static final <T> int tg(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @NotNull
    public static final String th(@NotNull int[] iArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Integer, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        bh(iArr, sb2, separator, prefix, postfix, i10, truncated, lVar);
        return sb2.toString();
    }

    @Nullable
    public static final Integer ti(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            int i11 = iArr[length];
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return Integer.valueOf(i11);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer tj(@NotNull int[] iArr, @NotNull ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (length == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i10 = i12;
                    rInvoke = rInvoke2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double tk(float[] fArr, ed.l<? super Float, Double> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Float.valueOf(fArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final short tl(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (s10 < s11) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> float tm(T[] tArr, ed.l<? super T, Float> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(tArr[i10]).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R tn(int[] iArr, Comparator<? super R> comparator, ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean to(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.3")
    public static final short tp(@NotNull short[] sArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (sArr.length != 0) {
            return sArr[random.q(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float tq(@NotNull float[] fArr, @NotNull ed.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    public static void tr(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = jArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            jArr[i10] = jArr[length2];
            jArr[length2] = j10;
            length2--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Boolean> ts(boolean[] zArr, ed.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (zArr.length == 0) {
            return EmptyList.f217510a;
        }
        boolean z10 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z10));
        int length = zArr.length;
        int i10 = 1;
        while (i10 < length) {
            Boolean boolInvoke = operation.invoke(Boolean.valueOf(z10), Boolean.valueOf(zArr[i10]));
            boolean zBooleanValue = boolInvoke.booleanValue();
            arrayList.add(boolInvoke);
            i10++;
            z10 = zBooleanValue;
        }
        return arrayList;
    }

    public static final double tt(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Double dValueOf = null;
        boolean z10 = false;
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                dValueOf = Double.valueOf(d10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.G.n(dValueOf, "null cannot be cast to non-null type kotlin.Double");
        return dValueOf.doubleValue();
    }

    @NotNull
    public static final char[] tu(@NotNull char[] cArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? new char[0] : C4875q.g1(cArr, indices.f221139a, indices.f221140b + 1);
    }

    @NotNull
    public static final float[] tv(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.G.o(fArrCopyOf, "copyOf(...)");
        Qu(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final int tw(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += b10;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final long tx(short[] sArr, ed.l<? super Short, Long> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long jLongValue = 0;
        for (short s10 : sArr) {
            jLongValue += selector.invoke(Short.valueOf(s10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Float> ty(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Float> tz(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(fArr.length));
        Fy(fArr, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean u5(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @NotNull
    public static final <K, V> Map<K, V> u6(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends K> keySelector, @NotNull ed.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(sArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (short s10 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s10)), valueTransform.invoke(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    public static final double u7(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (long j10 : jArr) {
            d10 += j10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @Xc.f
    public static final boolean u8(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr[4];
    }

    @NotNull
    public static final <T, K> List<T> u9(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (hashSet.add(selector.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Character, R>> uA(@NotNull char[] cArr, @NotNull R[] other) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            char c10 = cArr[i10];
            arrayList.add(new Pair(Character.valueOf(c10), other[i10]));
        }
        return arrayList;
    }

    @Xc.f
    public static final Float ua(float[] fArr, int i10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return ef(fArr, i10);
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Short>> C ub(@NotNull short[] sArr, @NotNull C destination, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                destination.add(Short.valueOf(s10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Byte uc(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
        }
        return null;
    }

    @kotlin.C
    @NotNull
    public static final <T, R, C extends Collection<? super R>> C ud(@NotNull T[] tArr, @NotNull C destination, @NotNull ed.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (T t10 : tArr) {
            N.s0(destination, transform.invoke(t10));
        }
        return destination;
    }

    public static final void ue(@NotNull int[] iArr, @NotNull ed.p<? super Integer, ? super Integer, L0> action) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final <K> Map<K, List<Long>> uf(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(Long.valueOf(j10));
        }
        return linkedHashMap;
    }

    public static final int ug(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @NotNull
    public static final String uh(@NotNull long[] jArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Long, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        ch(jArr, sb2, separator, prefix, postfix, i10, truncated, lVar);
        return sb2.toString();
    }

    @Nullable
    public static final Long ui(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long uj(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (length == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double uk(int[] iArr, ed.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Integer.valueOf(iArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Boolean ul(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                boolean z11 = zArr[i10];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) < 0) {
                    z10 = z11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float um(short[] sArr, ed.l<? super Short, Float> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Short.valueOf(sArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R un(long[] jArr, Comparator<? super R> comparator, ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean uo(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final boolean up(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return vp(zArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Integer uq(@NotNull int[] iArr, @NotNull ed.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Integer.valueOf(iIntValue);
    }

    @InterfaceC4887e0(version = "1.4")
    public static void ur(@NotNull long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        AbstractC4859d.f217603a.d(i10, i11, jArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            long j10 = jArr[i10];
            jArr[i10] = jArr[i13];
            jArr[i13] = j10;
            i13--;
            i10++;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Byte> us(byte[] bArr, ed.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (bArr.length == 0) {
            return EmptyList.f217510a;
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    public static final float ut(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final double[] uu(@NotNull double[] dArr, @NotNull Collection<Integer> indices) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr2[i10] = dArr[it.next().intValue()];
            i10++;
        }
        return dArr2;
    }

    @NotNull
    public static final int[] uv(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(...)");
        Su(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int uw(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final long ux(boolean[] zArr, ed.l<? super Boolean, Long> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long jLongValue = 0;
        for (boolean z10 : zArr) {
            jLongValue += selector.invoke(Boolean.valueOf(z10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Integer> uy(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Integer> uz(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(iArr.length));
        Gy(iArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final boolean v5(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K> Map<K, Boolean> v6(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(zArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (boolean z10 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z10)), Boolean.valueOf(z10));
        }
        return linkedHashMap;
    }

    public static final double v7(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (short s10 : sArr) {
            d10 += (double) s10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static boolean v8(@NotNull byte[] bArr, byte b10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return Vf(bArr, b10) >= 0;
    }

    @NotNull
    public static final <K> List<Short> v9(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends K> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (hashSet.add(selector.invoke(Short.valueOf(s10)))) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> vA(@NotNull char[] cArr, @NotNull R[] other, @NotNull ed.p<? super Character, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @Xc.f
    public static final Integer va(int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return ff(iArr, i10);
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Boolean>> C vb(@NotNull boolean[] zArr, @NotNull C destination, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Character vc(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C vd(@NotNull short[] sArr, @NotNull C destination, @NotNull ed.l<? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (short s10 : sArr) {
            N.s0(destination, transform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    public static final void ve(@NotNull long[] jArr, @NotNull ed.p<? super Integer, ? super Long, L0> action) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> vf(@NotNull long[] jArr, @NotNull ed.l<? super Long, ? extends K> keySelector, @NotNull ed.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    public static final int vg(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @NotNull
    public static final <T> String vh(@NotNull T[] tArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super T, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        dh(tArr, sb2, separator, prefix, postfix, i10, truncated, lVar);
        return sb2.toString();
    }

    @Nullable
    public static final Long vi(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            long j10 = jArr[length];
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T vj(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(t10);
            if (1 <= length) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double vk(long[] jArr, ed.l<? super Long, Double> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Long.valueOf(jArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Byte vl(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) < 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float vm(boolean[] zArr, ed.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Boolean.valueOf(zArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R> R vn(T[] tArr, Comparator<? super R> comparator, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean vo(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.3")
    public static final boolean vp(@NotNull boolean[] zArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (zArr.length != 0) {
            return zArr[random.q(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Long vq(@NotNull long[] jArr, @NotNull ed.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(jLongValue);
    }

    public static final <T> void vr(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = tArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            T t10 = tArr[i10];
            tArr[i10] = tArr[length2];
            tArr[length2] = t10;
            length2--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Character> vs(char[] cArr, ed.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (cArr.length == 0) {
            return EmptyList.f217510a;
        }
        char c10 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c10));
        int length = cArr.length;
        int i10 = 1;
        while (i10 < length) {
            Character chInvoke = operation.invoke(Integer.valueOf(i10), Character.valueOf(c10), Character.valueOf(cArr[i10]));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i10++;
            c10 = cCharValue;
        }
        return arrayList;
    }

    public static final float vt(@NotNull float[] fArr, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Float fValueOf = null;
        boolean z10 = false;
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                fValueOf = Float.valueOf(f10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.G.n(fValueOf, "null cannot be cast to non-null type kotlin.Float");
        return fValueOf.floatValue();
    }

    @NotNull
    public static final double[] vu(@NotNull double[] dArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? new double[0] : C4875q.h1(dArr, indices.f221139a, indices.f221140b + 1);
    }

    @NotNull
    public static final long[] vv(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(...)");
        Uu(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final int vw(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        int i10 = 0;
        for (short s10 : sArr) {
            i10 += s10;
        }
        return i10;
    }

    @dd.j(name = "sumOfShort")
    public static final int vx(@NotNull Short[] shArr) {
        kotlin.jvm.internal.G.p(shArr, "<this>");
        int iShortValue = 0;
        for (Short sh : shArr) {
            iShortValue += sh.shortValue();
        }
        return iShortValue;
    }

    @NotNull
    public static final List<Long> vy(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Long> vz(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(jArr.length));
        Hy(jArr, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean w5(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @NotNull
    public static final <K, V> Map<K, V> w6(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends K> keySelector, @NotNull ed.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(zArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (boolean z10 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z10)), valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @dd.j(name = "averageOfByte")
    public static final double w7(@NotNull Byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        double dByteValue = 0.0d;
        int i10 = 0;
        for (Byte b10 : bArr) {
            dByteValue += (double) b10.byteValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i10);
    }

    public static boolean w8(@NotNull char[] cArr, char c10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return Wf(cArr, c10) >= 0;
    }

    @NotNull
    public static final <K> List<Boolean> w9(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, ? extends K> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (hashSet.add(selector.invoke(Boolean.valueOf(z10)))) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Double, R>> wA(@NotNull double[] dArr, @NotNull Iterable<? extends R> other) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(Double.valueOf(dArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @Xc.f
    public static final Long wa(long[] jArr, int i10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return gf(jArr, i10);
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Byte>> C wb(@NotNull byte[] bArr, @NotNull C destination, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Character wc(@NotNull char[] cArr, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
        }
        return null;
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C wd(@NotNull boolean[] zArr, @NotNull C destination, @NotNull ed.l<? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (boolean z10 : zArr) {
            N.s0(destination, transform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    public static final <T> void we(@NotNull T[] tArr, @NotNull ed.p<? super Integer, ? super T, L0> action) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), tArr[i10]);
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> wf(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(t10);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Byte> wg(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Byte> setQz = qz(bArr);
        N.T0(setQz, other);
        return setQz;
    }

    @NotNull
    public static final String wh(@NotNull short[] sArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Short, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        eh(sArr, sb2, separator, prefix, postfix, i10, truncated, lVar);
        return sb2.toString();
    }

    @Nullable
    public static <T> T wi(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short wj(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (length == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                R rInvoke2 = selector.invoke(Short.valueOf(s11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s10 = s11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> Double wk(T[] tArr, ed.l<? super T, Double> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(tArr[i10]).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character wl(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) < 0) {
                    c10 = c11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R wm(byte[] bArr, ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R wn(short[] sArr, Comparator<? super R> comparator, ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean wo(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Boolean wp(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return xp(zArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S wq(@NotNull T[] tArr, @NotNull ed.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (Object) tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                sInvoke = operation.invoke(sInvoke, (Object) tArr[i10]);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final <T> void wr(@NotNull T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        AbstractC4859d.f217603a.d(i10, i11, tArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            T t10 = tArr[i10];
            tArr[i10] = tArr[i13];
            tArr[i13] = t10;
            i13--;
            i10++;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Double> ws(double[] dArr, ed.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (dArr.length == 0) {
            return EmptyList.f217510a;
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    public static int wt(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final float[] wu(@NotNull float[] fArr, @NotNull Collection<Integer> indices) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr2[i10] = fArr[it.next().intValue()];
            i10++;
        }
        return fArr2;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] wv(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        C4875q.h4(tArr2, Oc.g.x());
        return tArr2;
    }

    public static long ww(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final int wx(byte[] bArr, ed.l<? super Byte, kotlin.x0> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += selector.invoke(Byte.valueOf(b10)).f218498a;
        }
        return i10;
    }

    @NotNull
    public static final <T> List<T> wy(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Set<T> wz(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(tArr.length));
        Iy(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final boolean x5(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, ? super Byte>> M x6(@NotNull byte[] bArr, @NotNull M destination, @NotNull ed.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (byte b10 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b10)), Byte.valueOf(b10));
        }
        return destination;
    }

    @dd.j(name = "averageOfDouble")
    public static final double x7(@NotNull Double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        double dDoubleValue = 0.0d;
        int i10 = 0;
        for (Double d10 : dArr) {
            dDoubleValue += d10.doubleValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i10);
    }

    @InterfaceC4982o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @InterfaceC4852c0(expression = "any { it == element }", imports = {}))
    @InterfaceC4984p(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean x8(double[] dArr, double d10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        for (double d11 : dArr) {
            if (d11 == d10) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List<Byte> x9(@NotNull byte[] bArr, int i10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = bArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Xx(bArr, length);
    }

    @NotNull
    public static final <R, V> List<V> xA(@NotNull double[] dArr, @NotNull Iterable<? extends R> other, @NotNull ed.p<? super Double, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @Xc.f
    public static final <T> T xa(T[] tArr, int i10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return (T) hf(tArr, i10);
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Character>> C xb(@NotNull char[] cArr, @NotNull C destination, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Double xc(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    public static final <R> R xd(@NotNull byte[] bArr, R r10, @NotNull ed.p<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, Byte.valueOf(b10));
        }
        return r10;
    }

    public static final void xe(@NotNull short[] sArr, @NotNull ed.p<? super Integer, ? super Short, L0> action) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> xf(@NotNull T[] tArr, @NotNull ed.l<? super T, ? extends K> keySelector, @NotNull ed.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Character> xg(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Character> setRz = rz(cArr);
        N.T0(setRz, other);
        return setRz;
    }

    @NotNull
    public static final String xh(@NotNull boolean[] zArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super Boolean, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        fh(zArr, sb2, separator, prefix, postfix, i10, truncated, lVar);
        return sb2.toString();
    }

    @Nullable
    public static final <T> T xi(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            T t10 = tArr[length];
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> byte xj(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Byte.valueOf(b10));
            if (1 <= length) {
                while (true) {
                    byte b11 = bArr[i10];
                    R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        b10 = b11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return b10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double xk(short[] sArr, ed.l<? super Short, Double> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Short.valueOf(sArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double xl(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                double d11 = dArr[i10];
                if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) < 0) {
                    d10 = d11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R xm(char[] cArr, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R xn(boolean[] zArr, Comparator<? super R> comparator, ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final <T> boolean xo(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Boolean xp(@NotNull boolean[] zArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.q(zArr.length)]);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Short xq(@NotNull short[] sArr, @NotNull ed.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(sShortValue);
    }

    public static void xr(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = sArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            short s10 = sArr[i10];
            sArr[i10] = sArr[length2];
            sArr[length2] = s10;
            length2--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Float> xs(float[] fArr, ed.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (fArr.length == 0) {
            return EmptyList.f217510a;
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    public static final int xt(@NotNull int[] iArr, @NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Integer numValueOf = null;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                numValueOf = Integer.valueOf(i10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.G.n(numValueOf, "null cannot be cast to non-null type kotlin.Int");
        return numValueOf.intValue();
    }

    @NotNull
    public static final float[] xu(@NotNull float[] fArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? new float[0] : C4875q.i1(fArr, indices.f221139a, indices.f221140b + 1);
    }

    @NotNull
    public static final short[] xv(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.G.o(sArrCopyOf, "copyOf(...)");
        Yu(sArrCopyOf);
        return sArrCopyOf;
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final int xw(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Integer> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (byte b10 : bArr) {
            iIntValue += selector.invoke(Byte.valueOf(b10)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final int xx(char[] cArr, ed.l<? super Character, kotlin.x0> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int i10 = 0;
        for (char c10 : cArr) {
            i10 += selector.invoke(Character.valueOf(c10)).f218498a;
        }
        return i10;
    }

    @NotNull
    public static final List<Short> xy(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Short> xz(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(sArr.length));
        Jy(sArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> boolean y5(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M y6(@NotNull byte[] bArr, @NotNull M destination, @NotNull ed.l<? super Byte, ? extends K> keySelector, @NotNull ed.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (byte b10 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b10)), valueTransform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @dd.j(name = "averageOfFloat")
    public static final double y7(@NotNull Float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        double dFloatValue = 0.0d;
        int i10 = 0;
        for (Float f10 : fArr) {
            dFloatValue += (double) f10.floatValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i10);
    }

    @InterfaceC4982o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @InterfaceC4852c0(expression = "any { it == element }", imports = {}))
    @InterfaceC4984p(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean y8(float[] fArr, float f10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        for (float f11 : fArr) {
            if (f11 == f10) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List<Character> y9(@NotNull char[] cArr, int i10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = cArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Yx(cArr, length);
    }

    @NotNull
    public static final List<Pair<Double, Double>> yA(@NotNull double[] dArr, @NotNull double[] other) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(Double.valueOf(dArr[i10]), Double.valueOf(other[i10])));
        }
        return arrayList;
    }

    @Xc.f
    public static final Short ya(short[] sArr, int i10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return jf(sArr, i10);
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Double>> C yb(@NotNull double[] dArr, @NotNull C destination, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                destination.add(Double.valueOf(d10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Double yc(@NotNull double[] dArr, @NotNull ed.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
        }
        return null;
    }

    public static final <R> R yd(@NotNull char[] cArr, R r10, @NotNull ed.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (char c10 : cArr) {
            r10 = operation.invoke(r10, Character.valueOf(c10));
        }
        return r10;
    }

    public static final void ye(@NotNull boolean[] zArr, @NotNull ed.p<? super Integer, ? super Boolean, L0> action) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final <K> Map<K, List<Short>> yf(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(Short.valueOf(s10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Double> yg(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Double> setSz = sz(dArr);
        N.T0(setSz, other);
        return setSz;
    }

    public static /* synthetic */ String yh(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return ph(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @Nullable
    public static final Short yi(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char yj(@NotNull char[] cArr, @NotNull ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Character.valueOf(c10));
            if (1 <= length) {
                while (true) {
                    char c11 = cArr[i10];
                    R rInvoke2 = selector.invoke(Character.valueOf(c11));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        c10 = c11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return c10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double yk(boolean[] zArr, ed.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int i10 = 1;
        int length = zArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[i10])).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Float yl(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                float f11 = fArr[i10];
                if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) < 0) {
                    f10 = f11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R ym(double[] dArr, ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int i10 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Byte yn(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (b10 > b11) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    public static final <T> boolean yo(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Byte yp(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return zp(bArr, Random.f218007a);
    }

    public static final byte yq(@NotNull byte[] bArr, @NotNull ed.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = bArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            bByteValue = operation.invoke(Byte.valueOf(bArr[i11]), Byte.valueOf(bByteValue)).byteValue();
        }
        return bByteValue;
    }

    @InterfaceC4887e0(version = "1.4")
    public static void yr(@NotNull short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        AbstractC4859d.f217603a.d(i10, i11, sArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            short s10 = sArr[i10];
            sArr[i10] = sArr[i13];
            sArr[i13] = s10;
            i13--;
            i10++;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Integer> ys(int[] iArr, ed.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (iArr.length == 0) {
            return EmptyList.f217510a;
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    public static long yt(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static int[] yu(@NotNull int[] iArr, @NotNull Collection<Integer> indices) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr2[i10] = iArr[it.next().intValue()];
            i10++;
        }
        return iArr2;
    }

    @NotNull
    public static final <T> T[] yv(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.G.o(tArr2, "copyOf(...)");
        C4875q.h4(tArr2, comparator);
        return tArr2;
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final int yw(@NotNull char[] cArr, @NotNull ed.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (char c10 : cArr) {
            iIntValue += selector.invoke(Character.valueOf(c10)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final int yx(double[] dArr, ed.l<? super Double, kotlin.x0> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int i10 = 0;
        for (double d10 : dArr) {
            i10 += selector.invoke(Double.valueOf(d10)).f218498a;
        }
        return i10;
    }

    @NotNull
    public static final List<Boolean> yy(@NotNull boolean[] zArr, @NotNull ed.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Boolean> yz(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(zArr.length));
        Ky(zArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> boolean z5(@NotNull T[] tArr, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M z6(@NotNull char[] cArr, @NotNull M destination, @NotNull ed.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (char c10 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c10)), Character.valueOf(c10));
        }
        return destination;
    }

    @dd.j(name = "averageOfInt")
    public static final double z7(@NotNull Integer[] numArr) {
        kotlin.jvm.internal.G.p(numArr, "<this>");
        double dIntValue = 0.0d;
        int i10 = 0;
        for (Integer num : numArr) {
            dIntValue += (double) num.intValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i10);
    }

    public static boolean z8(@NotNull int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return Zf(iArr, i10) >= 0;
    }

    @NotNull
    public static final List<Double> z9(@NotNull double[] dArr, int i10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = dArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return Zx(dArr, length);
    }

    @NotNull
    public static final <V> List<V> zA(@NotNull double[] dArr, @NotNull double[] other, @NotNull ed.p<? super Double, ? super Double, ? extends V> transform) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), Double.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> za(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super Float>> C zb(@NotNull float[] fArr, @NotNull C destination, @NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                destination.add(Float.valueOf(f10));
            }
        }
        return destination;
    }

    @Nullable
    public static final Float zc(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final <R> R zd(@NotNull double[] dArr, R r10, @NotNull ed.p<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (double d10 : dArr) {
            r10 = operation.invoke(r10, Double.valueOf(d10));
        }
        return r10;
    }

    @NotNull
    public static md.l ze(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return new md.l(0, bArr.length - 1, 1);
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> zf(@NotNull short[] sArr, @NotNull ed.l<? super Short, ? extends K> keySelector, @NotNull ed.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Float> zg(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<Float> setTz = tz(fArr);
        N.T0(setTz, other);
        return setTz;
    }

    public static /* synthetic */ String zh(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return qh(cArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @Nullable
    public static final Short zi(@NotNull short[] sArr, @NotNull ed.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            short s10 = sArr[length];
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> double zj(@NotNull double[] dArr, @NotNull ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d10 = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(Double.valueOf(d10));
            if (1 <= length) {
                while (true) {
                    double d11 = dArr[i10];
                    R rInvoke2 = selector.invoke(Double.valueOf(d11));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        d10 = d11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return d10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float zk(byte[] bArr, ed.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Byte.valueOf(bArr[i10])).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Integer zl(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i12)) < 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R zm(float[] fArr, ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int i10 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character zn(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                if (kotlin.jvm.internal.G.t(c10, c11) > 0) {
                    c10 = c11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    public static final boolean zo(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Byte zp(@NotNull byte[] bArr, @NotNull Random random) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.q(bArr.length)]);
    }

    public static final char zq(@NotNull char[] cArr, @NotNull ed.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int length = cArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            cCharValue = operation.invoke(Character.valueOf(cArr[i11]), Character.valueOf(cCharValue)).charValue();
        }
        return cCharValue;
    }

    public static final void zr(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = zArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[length2];
            zArr[length2] = z10;
            length2--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final List<Long> zs(long[] jArr, ed.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (jArr.length == 0) {
            return EmptyList.f217510a;
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    public static final long zt(@NotNull long[] jArr, @NotNull ed.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Long lValueOf = null;
        boolean z10 = false;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                lValueOf = Long.valueOf(j10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.G.n(lValueOf, "null cannot be cast to non-null type kotlin.Long");
        return lValueOf.longValue();
    }

    @NotNull
    public static int[] zu(@NotNull int[] iArr, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? new int[0] : C4875q.j1(iArr, indices.f221139a, indices.f221140b + 1);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> zv(@NotNull byte[] bArr, @NotNull ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return Zv(bArr, new g.a(selector));
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final int zw(@NotNull double[] dArr, @NotNull ed.l<? super Double, Integer> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (double d10 : dArr) {
            iIntValue += selector.invoke(Double.valueOf(d10)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final int zx(float[] fArr, ed.l<? super Float, kotlin.x0> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int i10 = 0;
        for (float f10 : fArr) {
            i10 += selector.invoke(Float.valueOf(f10)).f218498a;
        }
        return i10;
    }

    @NotNull
    public static final boolean[] zy(@NotNull Boolean[] boolArr) {
        kotlin.jvm.internal.G.p(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = boolArr[i10].booleanValue();
        }
        return zArr;
    }

    @NotNull
    public static final Set<Byte> zz(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return EmptySet.f217512a;
        }
        if (length == 1) {
            return x0.f(Byte.valueOf(bArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(bArr.length));
        Cy(bArr, linkedHashSet);
        return linkedHashSet;
    }
}
