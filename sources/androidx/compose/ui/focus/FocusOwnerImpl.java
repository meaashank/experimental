package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.C0;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.d;
import androidx.compose.ui.node.AbstractC2206j;
import androidx.compose.ui.node.C2194b0;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.node.InterfaceC2203g;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import androidx.compose.ui.unit.LayoutDirection;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import kotlin.L0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,419:1\n360#1:446\n361#1:463\n363#1:509\n349#1:580\n350#1:652\n351#1:659\n352#1,2:706\n354#1:754\n355#1:761\n360#1:763\n361#1:780\n363#1:826\n349#1:828\n350#1:900\n351#1:907\n352#1,2:954\n354#1:1002\n355#1:1009\n360#1:1011\n361#1:1028\n363#1:1074\n349#1:1076\n350#1:1148\n351#1:1155\n352#1,2:1202\n354#1:1250\n355#1:1257\n59#2,5:420\n64#2,6:428\n43#2,4:434\n47#2,4:441\n1#3:425\n1#3:438\n1#3:449\n1#3:518\n1#3:589\n1#3:766\n1#3:837\n1#3:1014\n1#3:1085\n1#3:1266\n1#3:1429\n1#3:1527\n728#4,2:426\n728#4,2:439\n102#5:445\n102#5:510\n102#5:579\n110#5:762\n110#5:827\n104#5:1010\n104#5:1075\n96#5,7:1488\n96#5:1521\n255#6:447\n62#6:448\n63#6,8:450\n432#6,5:458\n437#6:464\n442#6,2:466\n444#6,8:471\n452#6,9:482\n461#6,8:494\n72#6,7:502\n283#6:511\n251#6,5:512\n62#6:517\n63#6,8:519\n432#6,5:527\n284#6:532\n437#6:533\n442#6,2:535\n444#6,8:540\n452#6,9:551\n461#6,8:563\n72#6,7:571\n286#6:578\n274#6,2:581\n251#6,5:583\n62#6:588\n63#6,8:590\n432#6,5:598\n276#6,3:603\n437#6:606\n442#6,2:608\n444#6,8:613\n452#6,9:624\n461#6,8:636\n72#6,7:644\n279#6:651\n432#6,12:660\n444#6,8:675\n452#6,9:686\n461#6,8:698\n432#6,12:708\n444#6,8:723\n452#6,9:734\n461#6,8:746\n255#6:764\n62#6:765\n63#6,8:767\n432#6,5:775\n437#6:781\n442#6,2:783\n444#6,8:788\n452#6,9:799\n461#6,8:811\n72#6,7:819\n274#6,2:829\n251#6,5:831\n62#6:836\n63#6,8:838\n432#6,5:846\n276#6,3:851\n437#6:854\n442#6,2:856\n444#6,8:861\n452#6,9:872\n461#6,8:884\n72#6,7:892\n279#6:899\n432#6,12:908\n444#6,8:923\n452#6,9:934\n461#6,8:946\n432#6,12:956\n444#6,8:971\n452#6,9:982\n461#6,8:994\n255#6:1012\n62#6:1013\n63#6,8:1015\n432#6,5:1023\n437#6:1029\n442#6,2:1031\n444#6,8:1036\n452#6,9:1047\n461#6,8:1059\n72#6,7:1067\n274#6,2:1077\n251#6,5:1079\n62#6:1084\n63#6,8:1086\n432#6,5:1094\n276#6,3:1099\n437#6:1102\n442#6,2:1104\n444#6,8:1109\n452#6,9:1120\n461#6,8:1132\n72#6,7:1140\n279#6:1147\n432#6,12:1156\n444#6,8:1171\n452#6,9:1182\n461#6,8:1194\n432#6,12:1204\n444#6,8:1219\n452#6,9:1230\n461#6,8:1242\n274#6,2:1258\n251#6,5:1260\n62#6:1265\n63#6,8:1267\n432#6,5:1275\n276#6,3:1280\n437#6:1283\n442#6,2:1285\n444#6,8:1290\n452#6,9:1301\n461#6,8:1313\n72#6,7:1321\n279#6:1328\n432#6,6:1335\n442#6,2:1342\n444#6,8:1347\n452#6,9:1358\n461#6,8:1370\n432#6,6:1378\n442#6,2:1385\n444#6,8:1390\n452#6,9:1401\n461#6,8:1413\n255#6:1427\n62#6:1428\n63#6,8:1430\n432#6,6:1438\n442#6,2:1445\n444#6,8:1450\n452#6,9:1461\n461#6,8:1473\n72#6,7:1481\n193#6,12:1496\n205#6,6:1515\n212#6,3:1523\n197#6:1526\n249#7:465\n249#7:534\n249#7:607\n249#7:782\n249#7:855\n249#7:1030\n249#7:1103\n249#7:1284\n249#7:1341\n249#7:1384\n249#7:1444\n249#7:1522\n245#8,3:468\n248#8,3:491\n245#8,3:537\n248#8,3:560\n245#8,3:610\n248#8,3:633\n245#8,3:672\n248#8,3:695\n245#8,3:720\n248#8,3:743\n245#8,3:785\n248#8,3:808\n245#8,3:858\n248#8,3:881\n245#8,3:920\n248#8,3:943\n245#8,3:968\n248#8,3:991\n245#8,3:1033\n248#8,3:1056\n245#8,3:1106\n248#8,3:1129\n245#8,3:1168\n248#8,3:1191\n245#8,3:1216\n248#8,3:1239\n245#8,3:1287\n248#8,3:1310\n245#8,3:1344\n248#8,3:1367\n245#8,3:1387\n248#8,3:1410\n245#8,3:1447\n248#8,3:1470\n1208#9:479\n1187#9,2:480\n1208#9:548\n1187#9,2:549\n1208#9:621\n1187#9,2:622\n1208#9:683\n1187#9,2:684\n1208#9:731\n1187#9,2:732\n1208#9:796\n1187#9,2:797\n1208#9:869\n1187#9,2:870\n1208#9:931\n1187#9,2:932\n1208#9:979\n1187#9,2:980\n1208#9:1044\n1187#9,2:1045\n1208#9:1117\n1187#9,2:1118\n1208#9:1179\n1187#9,2:1180\n1208#9:1227\n1187#9,2:1228\n1208#9:1298\n1187#9,2:1299\n1208#9:1355\n1187#9,2:1356\n1208#9:1398\n1187#9,2:1399\n1208#9:1458\n1187#9,2:1459\n51#10,6:653\n33#10,6:755\n51#10,6:901\n33#10,6:1003\n51#10,6:1149\n33#10,6:1251\n51#10,6:1329\n33#10,6:1421\n53#11:1495\n42#12,7:1508\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n268#1:446\n268#1:463\n268#1:509\n271#1:580\n271#1:652\n271#1:659\n271#1:706,2\n271#1:754\n271#1:761\n287#1:763\n287#1:780\n287#1:826\n289#1:828\n289#1:900\n289#1:907\n289#1:954,2\n289#1:1002\n289#1:1009\n307#1:1011\n307#1:1028\n307#1:1074\n309#1:1076\n309#1:1148\n309#1:1155\n309#1:1202,2\n309#1:1250\n309#1:1257\n148#1:420,5\n148#1:428,6\n177#1:434,4\n177#1:441,4\n148#1:425\n177#1:438\n268#1:449\n269#1:518\n271#1:589\n287#1:766\n289#1:837\n307#1:1014\n309#1:1085\n349#1:1266\n360#1:1429\n148#1:426,2\n177#1:439,2\n268#1:445\n269#1:510\n272#1:579\n287#1:762\n290#1:827\n307#1:1010\n310#1:1075\n378#1:1488,7\n379#1:1521\n268#1:447\n268#1:448\n268#1:450,8\n268#1:458,5\n268#1:464\n268#1:466,2\n268#1:471,8\n268#1:482,9\n268#1:494,8\n268#1:502,7\n269#1:511\n269#1:512,5\n269#1:517\n269#1:519,8\n269#1:527,5\n269#1:532\n269#1:533\n269#1:535,2\n269#1:540,8\n269#1:551,9\n269#1:563,8\n269#1:571,7\n269#1:578\n271#1:581,2\n271#1:583,5\n271#1:588\n271#1:590,8\n271#1:598,5\n271#1:603,3\n271#1:606\n271#1:608,2\n271#1:613,8\n271#1:624,9\n271#1:636,8\n271#1:644,7\n271#1:651\n271#1:660,12\n271#1:675,8\n271#1:686,9\n271#1:698,8\n271#1:708,12\n271#1:723,8\n271#1:734,9\n271#1:746,8\n287#1:764\n287#1:765\n287#1:767,8\n287#1:775,5\n287#1:781\n287#1:783,2\n287#1:788,8\n287#1:799,9\n287#1:811,8\n287#1:819,7\n289#1:829,2\n289#1:831,5\n289#1:836\n289#1:838,8\n289#1:846,5\n289#1:851,3\n289#1:854\n289#1:856,2\n289#1:861,8\n289#1:872,9\n289#1:884,8\n289#1:892,7\n289#1:899\n289#1:908,12\n289#1:923,8\n289#1:934,9\n289#1:946,8\n289#1:956,12\n289#1:971,8\n289#1:982,9\n289#1:994,8\n307#1:1012\n307#1:1013\n307#1:1015,8\n307#1:1023,5\n307#1:1029\n307#1:1031,2\n307#1:1036,8\n307#1:1047,9\n307#1:1059,8\n307#1:1067,7\n309#1:1077,2\n309#1:1079,5\n309#1:1084\n309#1:1086,8\n309#1:1094,5\n309#1:1099,3\n309#1:1102\n309#1:1104,2\n309#1:1109,8\n309#1:1120,9\n309#1:1132,8\n309#1:1140,7\n309#1:1147\n309#1:1156,12\n309#1:1171,8\n309#1:1182,9\n309#1:1194,8\n309#1:1204,12\n309#1:1219,8\n309#1:1230,9\n309#1:1242,8\n349#1:1258,2\n349#1:1260,5\n349#1:1265\n349#1:1267,8\n349#1:1275,5\n349#1:1280,3\n349#1:1283\n349#1:1285,2\n349#1:1290,8\n349#1:1301,9\n349#1:1313,8\n349#1:1321,7\n349#1:1328\n351#1:1335,6\n351#1:1342,2\n351#1:1347,8\n351#1:1358,9\n351#1:1370,8\n353#1:1378,6\n353#1:1385,2\n353#1:1390,8\n353#1:1401,9\n353#1:1413,8\n360#1:1427\n360#1:1428\n360#1:1430,8\n360#1:1438,6\n360#1:1445,2\n360#1:1450,8\n360#1:1461,9\n360#1:1473,8\n360#1:1481,7\n378#1:1496,12\n378#1:1515,6\n378#1:1523,3\n378#1:1526\n268#1:465\n269#1:534\n271#1:607\n287#1:782\n289#1:855\n307#1:1030\n309#1:1103\n349#1:1284\n351#1:1341\n353#1:1384\n360#1:1444\n379#1:1522\n268#1:468,3\n268#1:491,3\n269#1:537,3\n269#1:560,3\n271#1:610,3\n271#1:633,3\n271#1:672,3\n271#1:695,3\n271#1:720,3\n271#1:743,3\n287#1:785,3\n287#1:808,3\n289#1:858,3\n289#1:881,3\n289#1:920,3\n289#1:943,3\n289#1:968,3\n289#1:991,3\n307#1:1033,3\n307#1:1056,3\n309#1:1106,3\n309#1:1129,3\n309#1:1168,3\n309#1:1191,3\n309#1:1216,3\n309#1:1239,3\n349#1:1287,3\n349#1:1310,3\n351#1:1344,3\n351#1:1367,3\n353#1:1387,3\n353#1:1410,3\n360#1:1447,3\n360#1:1470,3\n268#1:479\n268#1:480,2\n269#1:548\n269#1:549,2\n271#1:621\n271#1:622,2\n271#1:683\n271#1:684,2\n271#1:731\n271#1:732,2\n287#1:796\n287#1:797,2\n289#1:869\n289#1:870,2\n289#1:931\n289#1:932,2\n289#1:979\n289#1:980,2\n307#1:1044\n307#1:1045,2\n309#1:1117\n309#1:1118,2\n309#1:1179\n309#1:1180,2\n309#1:1227\n309#1:1228,2\n349#1:1298\n349#1:1299,2\n351#1:1355\n351#1:1356,2\n353#1:1398\n353#1:1399,2\n360#1:1458\n360#1:1459,2\n271#1:653,6\n271#1:755,6\n289#1:901,6\n289#1:1003,6\n309#1:1149,6\n309#1:1251,6\n350#1:1329,6\n354#1:1421,6\n378#1:1495\n378#1:1508,7\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class FocusOwnerImpl implements t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f100553k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.p<C1989d, P.j, Boolean> f100554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<C1989d, Boolean> f100555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<L0> f100556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<P.j> f100557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<LayoutDirection> f100558e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final FocusInvalidationManager f100560g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public C0 f100563j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public FocusTargetNode f100559f = new FocusTargetNode();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final M f100561h = new M();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.p f100562i = w.a(androidx.compose.ui.p.f103112M2, new ed.l<v, L0>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final void e(@NotNull v vVar) {
            vVar.j(false);
        }

        @Override // ed.l
        public L0 invoke(v vVar) {
            vVar.j(false);
            return L0.f217464a;
        }
    }).P0(new W<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // androidx.compose.ui.node.W
        public p.d c() {
            return this.f100570c.f100559f;
        }

        @Override // androidx.compose.ui.node.W
        public boolean equals(@Nullable Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.W
        public void f(@NotNull C2278s0 c2278s0) {
            c2278s0.f103927a = "RootFocusTarget";
        }

        @Override // androidx.compose.ui.node.W
        public /* bridge */ /* synthetic */ void h(p.d dVar) {
        }

        @Override // androidx.compose.ui.node.W
        public int hashCode() {
            return this.f100570c.f100559f.hashCode();
        }

        @NotNull
        public FocusTargetNode i() {
            return this.f100570c.f100559f;
        }

        public void j(@NotNull FocusTargetNode focusTargetNode) {
        }
    });

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100564a;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f100564a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(@NotNull ed.l<? super InterfaceC4376a<L0>, L0> lVar, @NotNull ed.p<? super C1989d, ? super P.j, Boolean> pVar, @NotNull ed.l<? super C1989d, Boolean> lVar2, @NotNull InterfaceC4376a<L0> interfaceC4376a, @NotNull InterfaceC4376a<P.j> interfaceC4376a2, @NotNull InterfaceC4376a<? extends LayoutDirection> interfaceC4376a3) {
        this.f100554a = pVar;
        this.f100555b = lVar2;
        this.f100556c = interfaceC4376a;
        this.f100557d = interfaceC4376a2;
        this.f100558e = interfaceC4376a3;
        this.f100560g = new FocusInvalidationManager(lVar, new FocusOwnerImpl$focusInvalidationManager$1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.ui.focus.FocusOwnerImpl] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r15v6, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // androidx.compose.ui.focus.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(@org.jetbrains.annotations.NotNull android.view.KeyEvent r14, @org.jetbrains.annotations.NotNull ed.InterfaceC4376a<java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.a(android.view.KeyEvent, ed.a):boolean");
    }

    @Override // androidx.compose.ui.focus.t
    @NotNull
    public androidx.compose.ui.p b() {
        return this.f100562i;
    }

    @Override // androidx.compose.ui.focus.t
    @NotNull
    public M c() {
        return this.f100561h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // androidx.compose.ui.focus.t
    public boolean d(@NotNull KeyEvent keyEvent) {
        androidx.compose.ui.input.key.j jVar;
        int size;
        C2194b0 c2194b0;
        ?? L10;
        C2194b0 c2194b02;
        if (this.f100560g.b()) {
            throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
        }
        FocusTargetNode focusTargetNodeB = N.b(this.f100559f);
        if (focusTargetNodeB != null) {
            p.d dVar = focusTargetNodeB.f103115a;
            if (!dVar.f103127m) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            LayoutNode layoutNodeR = C2204h.r(focusTargetNodeB);
            loop0: while (true) {
                if (layoutNodeR == null) {
                    L10 = 0;
                    break;
                }
                if ((layoutNodeR.f102729A.f103039e.f103118d & 131072) != 0) {
                    while (dVar != null) {
                        if ((dVar.f103117c & 131072) != 0) {
                            androidx.compose.runtime.collection.c cVar = null;
                            L10 = dVar;
                            while (L10 != 0) {
                                if (L10 instanceof androidx.compose.ui.input.key.j) {
                                    break loop0;
                                }
                                if ((L10.f103117c & 131072) != 0 && (L10 instanceof AbstractC2206j)) {
                                    p.d dVar2 = ((AbstractC2206j) L10).f103066p;
                                    int i10 = 0;
                                    L10 = L10;
                                    while (dVar2 != null) {
                                        if ((dVar2.f103117c & 131072) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                L10 = dVar2;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                }
                                                if (L10 != 0) {
                                                    cVar.b(L10);
                                                    L10 = 0;
                                                }
                                                cVar.b(dVar2);
                                            }
                                        }
                                        dVar2 = dVar2.f103120f;
                                        L10 = L10;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                L10 = C2204h.l(cVar);
                            }
                        }
                        dVar = dVar.f103119e;
                    }
                }
                layoutNodeR = layoutNodeR.D0();
                dVar = (layoutNodeR == null || (c2194b02 = layoutNodeR.f102729A) == null) ? null : c2194b02.f103038d;
            }
            jVar = (androidx.compose.ui.input.key.j) L10;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            if (!jVar.g0().f103127m) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            p.d dVar3 = jVar.g0().f103119e;
            LayoutNode layoutNodeR2 = C2204h.r(jVar);
            ArrayList arrayList = null;
            while (layoutNodeR2 != null) {
                if ((layoutNodeR2.f102729A.f103039e.f103118d & 131072) != 0) {
                    while (dVar3 != null) {
                        if ((dVar3.f103117c & 131072) != 0) {
                            p.d dVarL = dVar3;
                            androidx.compose.runtime.collection.c cVar2 = null;
                            while (dVarL != null) {
                                if (dVarL instanceof androidx.compose.ui.input.key.j) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(dVarL);
                                } else if ((dVarL.f103117c & 131072) != 0 && (dVarL instanceof AbstractC2206j)) {
                                    int i11 = 0;
                                    for (p.d dVar4 = ((AbstractC2206j) dVarL).f103066p; dVar4 != null; dVar4 = dVar4.f103120f) {
                                        if ((dVar4.f103117c & 131072) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                dVarL = dVar4;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                }
                                                if (dVarL != null) {
                                                    cVar2.b(dVarL);
                                                    dVarL = null;
                                                }
                                                cVar2.b(dVar4);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                dVarL = C2204h.l(cVar2);
                            }
                        }
                        dVar3 = dVar3.f103119e;
                    }
                }
                layoutNodeR2 = layoutNodeR2.D0();
                dVar3 = (layoutNodeR2 == null || (c2194b0 = layoutNodeR2.f102729A) == null) ? null : c2194b0.f103038d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((androidx.compose.ui.input.key.j) arrayList.get(size)).r0(keyEvent)) {
                        break;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            ?? G02 = jVar.g0();
            androidx.compose.runtime.collection.c cVar3 = null;
            while (true) {
                if (G02 != 0) {
                    if (G02 instanceof androidx.compose.ui.input.key.j) {
                        if (((androidx.compose.ui.input.key.j) G02).r0(keyEvent)) {
                            break;
                        }
                    } else if ((G02.f103117c & 131072) != 0 && (G02 instanceof AbstractC2206j)) {
                        p.d dVar5 = ((AbstractC2206j) G02).f103066p;
                        int i13 = 0;
                        G02 = G02;
                        while (dVar5 != null) {
                            if ((dVar5.f103117c & 131072) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    G02 = dVar5;
                                } else {
                                    if (cVar3 == null) {
                                        cVar3 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                    }
                                    if (G02 != 0) {
                                        cVar3.b(G02);
                                        G02 = 0;
                                    }
                                    cVar3.b(dVar5);
                                }
                            }
                            dVar5 = dVar5.f103120f;
                            G02 = G02;
                        }
                        if (i13 == 1) {
                        }
                    }
                    G02 = C2204h.l(cVar3);
                } else {
                    ?? G03 = jVar.g0();
                    androidx.compose.runtime.collection.c cVar4 = null;
                    while (true) {
                        if (G03 != 0) {
                            if (G03 instanceof androidx.compose.ui.input.key.j) {
                                if (((androidx.compose.ui.input.key.j) G03).C0(keyEvent)) {
                                    break;
                                }
                            } else if ((G03.f103117c & 131072) != 0 && (G03 instanceof AbstractC2206j)) {
                                p.d dVar6 = ((AbstractC2206j) G03).f103066p;
                                int i14 = 0;
                                G03 = G03;
                                while (dVar6 != null) {
                                    if ((dVar6.f103117c & 131072) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            G03 = dVar6;
                                        } else {
                                            if (cVar4 == null) {
                                                cVar4 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                            }
                                            if (G03 != 0) {
                                                cVar4.b(G03);
                                                G03 = 0;
                                            }
                                            cVar4.b(dVar6);
                                        }
                                    }
                                    dVar6 = dVar6.f103120f;
                                    G03 = G03;
                                }
                                if (i14 == 1) {
                                }
                            }
                            G03 = C2204h.l(cVar4);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                if (!((androidx.compose.ui.input.key.j) arrayList.get(i15)).C0(keyEvent)) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // androidx.compose.ui.focus.t
    public boolean e(@NotNull androidx.compose.ui.input.rotary.d dVar) {
        androidx.compose.ui.input.rotary.b bVar;
        int size;
        C2194b0 c2194b0;
        ?? L10;
        C2194b0 c2194b02;
        if (this.f100560g.b()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        FocusTargetNode focusTargetNodeB = N.b(this.f100559f);
        if (focusTargetNodeB != null) {
            p.d dVar2 = focusTargetNodeB.f103115a;
            if (!dVar2.f103127m) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            LayoutNode layoutNodeR = C2204h.r(focusTargetNodeB);
            loop0: while (true) {
                if (layoutNodeR == null) {
                    L10 = 0;
                    break;
                }
                if ((layoutNodeR.f102729A.f103039e.f103118d & 16384) != 0) {
                    while (dVar2 != null) {
                        if ((dVar2.f103117c & 16384) != 0) {
                            androidx.compose.runtime.collection.c cVar = null;
                            L10 = dVar2;
                            while (L10 != 0) {
                                if (L10 instanceof androidx.compose.ui.input.rotary.b) {
                                    break loop0;
                                }
                                if ((L10.f103117c & 16384) != 0 && (L10 instanceof AbstractC2206j)) {
                                    p.d dVar3 = ((AbstractC2206j) L10).f103066p;
                                    int i10 = 0;
                                    L10 = L10;
                                    while (dVar3 != null) {
                                        if ((dVar3.f103117c & 16384) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                L10 = dVar3;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                }
                                                if (L10 != 0) {
                                                    cVar.b(L10);
                                                    L10 = 0;
                                                }
                                                cVar.b(dVar3);
                                            }
                                        }
                                        dVar3 = dVar3.f103120f;
                                        L10 = L10;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                L10 = C2204h.l(cVar);
                            }
                        }
                        dVar2 = dVar2.f103119e;
                    }
                }
                layoutNodeR = layoutNodeR.D0();
                dVar2 = (layoutNodeR == null || (c2194b02 = layoutNodeR.f102729A) == null) ? null : c2194b02.f103038d;
            }
            bVar = (androidx.compose.ui.input.rotary.b) L10;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            if (!bVar.g0().f103127m) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            p.d dVar4 = bVar.g0().f103119e;
            LayoutNode layoutNodeR2 = C2204h.r(bVar);
            ArrayList arrayList = null;
            while (layoutNodeR2 != null) {
                if ((layoutNodeR2.f102729A.f103039e.f103118d & 16384) != 0) {
                    while (dVar4 != null) {
                        if ((dVar4.f103117c & 16384) != 0) {
                            p.d dVarL = dVar4;
                            androidx.compose.runtime.collection.c cVar2 = null;
                            while (dVarL != null) {
                                if (dVarL instanceof androidx.compose.ui.input.rotary.b) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(dVarL);
                                } else if ((dVarL.f103117c & 16384) != 0 && (dVarL instanceof AbstractC2206j)) {
                                    int i11 = 0;
                                    for (p.d dVar5 = ((AbstractC2206j) dVarL).f103066p; dVar5 != null; dVar5 = dVar5.f103120f) {
                                        if ((dVar5.f103117c & 16384) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                dVarL = dVar5;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                }
                                                if (dVarL != null) {
                                                    cVar2.b(dVarL);
                                                    dVarL = null;
                                                }
                                                cVar2.b(dVar5);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                dVarL = C2204h.l(cVar2);
                            }
                        }
                        dVar4 = dVar4.f103119e;
                    }
                }
                layoutNodeR2 = layoutNodeR2.D0();
                dVar4 = (layoutNodeR2 == null || (c2194b0 = layoutNodeR2.f102729A) == null) ? null : c2194b0.f103038d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((androidx.compose.ui.input.rotary.b) arrayList.get(size)).z1(dVar)) {
                        break;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            ?? G02 = bVar.g0();
            androidx.compose.runtime.collection.c cVar3 = null;
            while (true) {
                if (G02 != 0) {
                    if (G02 instanceof androidx.compose.ui.input.rotary.b) {
                        if (((androidx.compose.ui.input.rotary.b) G02).z1(dVar)) {
                            break;
                        }
                    } else if ((G02.f103117c & 16384) != 0 && (G02 instanceof AbstractC2206j)) {
                        p.d dVar6 = ((AbstractC2206j) G02).f103066p;
                        int i13 = 0;
                        G02 = G02;
                        while (dVar6 != null) {
                            if ((dVar6.f103117c & 16384) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    G02 = dVar6;
                                } else {
                                    if (cVar3 == null) {
                                        cVar3 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                    }
                                    if (G02 != 0) {
                                        cVar3.b(G02);
                                        G02 = 0;
                                    }
                                    cVar3.b(dVar6);
                                }
                            }
                            dVar6 = dVar6.f103120f;
                            G02 = G02;
                        }
                        if (i13 == 1) {
                        }
                    }
                    G02 = C2204h.l(cVar3);
                } else {
                    ?? G03 = bVar.g0();
                    androidx.compose.runtime.collection.c cVar4 = null;
                    while (true) {
                        if (G03 != 0) {
                            if (G03 instanceof androidx.compose.ui.input.rotary.b) {
                                if (((androidx.compose.ui.input.rotary.b) G03).d2(dVar)) {
                                    break;
                                }
                            } else if ((G03.f103117c & 16384) != 0 && (G03 instanceof AbstractC2206j)) {
                                p.d dVar7 = ((AbstractC2206j) G03).f103066p;
                                int i14 = 0;
                                G03 = G03;
                                while (dVar7 != null) {
                                    if ((dVar7.f103117c & 16384) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            G03 = dVar7;
                                        } else {
                                            if (cVar4 == null) {
                                                cVar4 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                            }
                                            if (G03 != 0) {
                                                cVar4.b(G03);
                                                G03 = 0;
                                            }
                                            cVar4.b(dVar7);
                                        }
                                    }
                                    dVar7 = dVar7.f103120f;
                                    G03 = G03;
                                }
                                if (i14 == 1) {
                                }
                            }
                            G03 = C2204h.l(cVar4);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                if (!((androidx.compose.ui.input.rotary.b) arrayList.get(i15)).d2(dVar)) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.t
    public boolean f(boolean z10, boolean z11, boolean z12, int i10) {
        boolean zD;
        M m10 = this.f100561h;
        FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 = new InterfaceC4376a<L0>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                return L0.f217464a;
            }
        };
        try {
            if (m10.f100631c) {
                m10.g();
            }
            m10.f100631c = true;
            if (focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 != null) {
                m10.f100630b.b(focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1);
            }
            if (!z10) {
                int i11 = a.f100564a[FocusTransactionsKt.h(this.f100559f, i10).ordinal()];
                zD = (i11 == 1 || i11 == 2 || i11 == 3) ? false : FocusTransactionsKt.d(this.f100559f, z10, z11);
            }
            if (zD && z12) {
                this.f100556c.invoke();
            }
            return zD;
        } finally {
            m10.h();
        }
    }

    @Override // androidx.compose.ui.focus.t
    public boolean g(final int i10, @Nullable P.j jVar) {
        Boolean boolP = p(i10, jVar, new ed.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull FocusTargetNode focusTargetNode) {
                Boolean boolN = FocusTransactionsKt.n(focusTargetNode, i10);
                return Boolean.valueOf(boolN != null ? boolN.booleanValue() : false);
            }
        });
        if (boolP != null) {
            return boolP.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.t
    public boolean h(@Nullable C1989d c1989d, @Nullable P.j jVar) {
        return this.f100554a.invoke(c1989d, jVar).booleanValue();
    }

    @Override // androidx.compose.ui.focus.t
    public void i(@NotNull InterfaceC1993h interfaceC1993h) {
        this.f100560g.e(interfaceC1993h);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.InterfaceC1999n
    public boolean j(final int i10) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f217904a = Boolean.FALSE;
        Boolean boolP = p(i10, this.f100557d.invoke(), new ed.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull FocusTargetNode focusTargetNode) {
                objectRef.f217904a = FocusTransactionsKt.n(focusTargetNode, i10);
                Boolean bool = objectRef.f217904a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        });
        if (boolP == null || objectRef.f217904a == 0) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (boolP.equals(bool) && kotlin.jvm.internal.G.g(objectRef.f217904a, bool)) {
            return true;
        }
        return u.a(i10) ? f(false, true, false, i10) && g(i10, null) : this.f100555b.invoke(new C1989d(i10)).booleanValue();
    }

    @Override // androidx.compose.ui.focus.t
    public void k(@NotNull FocusTargetNode focusTargetNode) {
        this.f100560g.g(focusTargetNode);
    }

    @Override // androidx.compose.ui.focus.t
    @NotNull
    public H l() {
        return this.f100559f.y1();
    }

    @Override // androidx.compose.ui.focus.t
    public void m(@NotNull x xVar) {
        this.f100560g.f(xVar);
    }

    @Override // androidx.compose.ui.focus.t
    @Nullable
    public P.j n() {
        FocusTargetNode focusTargetNodeB = N.b(this.f100559f);
        if (focusTargetNodeB != null) {
            return N.d(focusTargetNodeB);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.t
    public void o() {
        M m10 = this.f100561h;
        if (m10.f100631c) {
            FocusTransactionsKt.d(this.f100559f, true, true);
            return;
        }
        try {
            m10.f100631c = true;
            FocusTransactionsKt.d(this.f100559f, true, true);
        } finally {
            m10.h();
        }
    }

    @Override // androidx.compose.ui.focus.t
    @Nullable
    public Boolean p(int i10, @Nullable P.j jVar, @NotNull final ed.l<? super FocusTargetNode, Boolean> lVar) {
        final FocusTargetNode focusTargetNodeB = N.b(this.f100559f);
        if (focusTargetNodeB != null) {
            FocusRequester focusRequesterA = N.a(focusTargetNodeB, i10, this.f100558e.invoke());
            FocusRequester.a aVar = FocusRequester.f100591b;
            aVar.getClass();
            if (kotlin.jvm.internal.G.g(focusRequesterA, FocusRequester.f100594e)) {
                return null;
            }
            aVar.getClass();
            if (!kotlin.jvm.internal.G.g(focusRequesterA, FocusRequester.f100593d)) {
                return Boolean.valueOf(focusRequesterA.e(lVar));
            }
        } else {
            focusTargetNodeB = null;
        }
        return N.e(this.f100559f, i10, this.f100558e.invoke(), jVar, new ed.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull FocusTargetNode focusTargetNode) {
                boolean zBooleanValue;
                if (kotlin.jvm.internal.G.g(focusTargetNode, focusTargetNodeB)) {
                    zBooleanValue = false;
                } else {
                    if (kotlin.jvm.internal.G.g(focusTargetNode, this.f100559f)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = lVar.invoke(focusTargetNode).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    @Override // androidx.compose.ui.focus.InterfaceC1999n
    public void q(boolean z10) {
        C1989d.f100651b.getClass();
        f(z10, true, true, C1989d.f100659j);
    }

    @NotNull
    public final FocusTargetNode s() {
        return this.f100559f;
    }

    public final void t() {
        if (this.f100559f.y1() == FocusStateImpl.Inactive) {
            this.f100556c.invoke();
        }
    }

    public final p.d u(InterfaceC2203g interfaceC2203g) {
        p.d dVar = null;
        if (!interfaceC2203g.g0().f103127m) {
            W.a.g("visitLocalDescendants called on an unattached node");
            throw null;
        }
        p.d dVarG0 = interfaceC2203g.g0();
        if ((dVarG0.f103118d & 9216) != 0) {
            for (p.d dVar2 = dVarG0.f103120f; dVar2 != null; dVar2 = dVar2.f103120f) {
                int i10 = dVar2.f103117c;
                if ((i10 & 9216) != 0) {
                    if ((i10 & 1024) != 0) {
                        break;
                    }
                    dVar = dVar2;
                }
            }
        }
        return dVar;
    }

    public final <T> T v(InterfaceC2203g interfaceC2203g, int i10) {
        C2194b0 c2194b0;
        if (!interfaceC2203g.g0().f103127m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        p.d dVarG0 = interfaceC2203g.g0();
        LayoutNode layoutNodeR = C2204h.r(interfaceC2203g);
        while (layoutNodeR != null) {
            if ((layoutNodeR.f102729A.f103039e.f103118d & i10) != 0) {
                while (dVarG0 != null) {
                    if ((dVarG0.f103117c & i10) != 0) {
                        kotlin.jvm.internal.G.P();
                        throw null;
                    }
                    dVarG0 = dVarG0.f103119e;
                }
            }
            layoutNodeR = layoutNodeR.D0();
            dVarG0 = (layoutNodeR == null || (c2194b0 = layoutNodeR.f102729A) == null) ? null : c2194b0.f103038d;
        }
        return null;
    }

    public final void w(@NotNull FocusTargetNode focusTargetNode) {
        this.f100559f = focusTargetNode;
    }

    public final <T extends InterfaceC2203g> void x(InterfaceC2203g interfaceC2203g, int i10, ed.l<? super T, L0> lVar, InterfaceC4376a<L0> interfaceC4376a, ed.l<? super T, L0> lVar2) {
        C2194b0 c2194b0;
        if (!interfaceC2203g.g0().f103127m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        p.d dVar = interfaceC2203g.g0().f103119e;
        LayoutNode layoutNodeR = C2204h.r(interfaceC2203g);
        while (layoutNodeR != null) {
            if ((layoutNodeR.f102729A.f103039e.f103118d & i10) != 0) {
                while (dVar != null) {
                    if ((dVar.f103117c & i10) != 0) {
                        kotlin.jvm.internal.G.P();
                        throw null;
                    }
                    dVar = dVar.f103119e;
                }
            }
            layoutNodeR = layoutNodeR.D0();
            dVar = (layoutNodeR == null || (c2194b0 = layoutNodeR.f102729A) == null) ? null : c2194b0.f103038d;
        }
        if (interfaceC2203g.g0() != null) {
            kotlin.jvm.internal.G.P();
            throw null;
        }
        interfaceC4376a.invoke();
        if (interfaceC2203g.g0() == null) {
            return;
        }
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public final boolean y(KeyEvent keyEvent) {
        long jA = androidx.compose.ui.input.key.e.a(keyEvent);
        int iB = androidx.compose.ui.input.key.e.b(keyEvent);
        d.a aVar = androidx.compose.ui.input.key.d.f102101b;
        aVar.getClass();
        if (iB == androidx.compose.ui.input.key.d.f102104e) {
            C0 c02 = this.f100563j;
            if (c02 == null) {
                c02 = new C0(3);
                this.f100563j = c02;
            }
            c02.U(jA);
        } else {
            aVar.getClass();
            if (iB == androidx.compose.ui.input.key.d.f102103d) {
                C0 c03 = this.f100563j;
                if (c03 == null || !c03.d(jA)) {
                    return false;
                }
                C0 c04 = this.f100563j;
                if (c04 != null) {
                    c04.X(jA);
                }
            }
        }
        return true;
    }
}
