package androidx.compose.ui.node;

import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTraversableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,230:1\n112#2:231\n112#2:297\n112#2:363\n112#2:429\n112#2:495\n112#2:566\n112#2:637\n112#2:716\n251#3,5:232\n62#3:237\n63#3,8:239\n432#3,6:247\n442#3,2:254\n444#3,8:259\n452#3,9:270\n461#3,8:282\n72#3,7:290\n251#3,5:298\n62#3:303\n63#3,8:305\n432#3,6:313\n442#3,2:320\n444#3,8:325\n452#3,9:336\n461#3,8:348\n72#3,7:356\n251#3,5:364\n62#3:369\n63#3,8:371\n432#3,6:379\n442#3,2:386\n444#3,8:391\n452#3,9:402\n461#3,8:414\n72#3,7:422\n251#3,5:430\n62#3:435\n63#3,8:437\n432#3,6:445\n442#3,2:452\n444#3,8:457\n452#3,9:468\n461#3,8:480\n72#3,7:488\n297#3:496\n137#3:497\n138#3:499\n139#3,7:503\n146#3,9:511\n432#3,6:520\n442#3,2:527\n444#3,17:532\n461#3,8:552\n155#3,6:560\n297#3:567\n137#3:568\n138#3:570\n139#3,7:574\n146#3,9:582\n432#3,6:591\n442#3,2:598\n444#3,17:603\n461#3,8:623\n155#3,6:631\n310#3:638\n167#3:639\n168#3:647\n169#3,12:651\n311#3:663\n432#3,5:664\n312#3,2:669\n437#3:671\n442#3,2:673\n444#3,17:678\n461#3,8:698\n314#3:706\n181#3,8:707\n315#3:715\n310#3:717\n167#3:718\n168#3:726\n169#3,12:730\n311#3:742\n432#3,5:743\n312#3,2:748\n437#3:750\n442#3,2:752\n444#3,17:757\n461#3,8:777\n314#3:785\n181#3,8:786\n315#3:794\n1#4:238\n1#4:304\n1#4:370\n1#4:436\n1#4:498\n1#4:569\n249#5:253\n249#5:319\n249#5:385\n249#5:451\n249#5:526\n249#5:597\n249#5:672\n249#5:751\n245#6,3:256\n248#6,3:279\n245#6,3:322\n248#6,3:345\n245#6,3:388\n248#6,3:411\n245#6,3:454\n248#6,3:477\n245#6,3:529\n248#6,3:549\n245#6,3:600\n248#6,3:620\n245#6,3:675\n248#6,3:695\n245#6,3:754\n248#6,3:774\n1208#7:267\n1187#7,2:268\n1208#7:333\n1187#7,2:334\n1208#7:399\n1187#7,2:400\n1208#7:465\n1187#7,2:466\n1208#7:500\n1187#7,2:501\n1208#7:571\n1187#7,2:572\n1208#7:648\n1187#7,2:649\n1208#7:727\n1187#7,2:728\n48#8:510\n48#8:581\n42#9,7:640\n42#9,7:719\n*S KotlinDebug\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n*L\n58#1:231\n70#1:297\n92#1:363\n111#1:429\n138#1:495\n159#1:566\n187#1:637\n214#1:716\n58#1:232,5\n58#1:237\n58#1:239,8\n58#1:247,6\n58#1:254,2\n58#1:259,8\n58#1:270,9\n58#1:282,8\n58#1:290,7\n70#1:298,5\n70#1:303\n70#1:305,8\n70#1:313,6\n70#1:320,2\n70#1:325,8\n70#1:336,9\n70#1:348,8\n70#1:356,7\n92#1:364,5\n92#1:369\n92#1:371,8\n92#1:379,6\n92#1:386,2\n92#1:391,8\n92#1:402,9\n92#1:414,8\n92#1:422,7\n111#1:430,5\n111#1:435\n111#1:437,8\n111#1:445,6\n111#1:452,2\n111#1:457,8\n111#1:468,9\n111#1:480,8\n111#1:488,7\n138#1:496\n138#1:497\n138#1:499\n138#1:503,7\n138#1:511,9\n138#1:520,6\n138#1:527,2\n138#1:532,17\n138#1:552,8\n138#1:560,6\n159#1:567\n159#1:568\n159#1:570\n159#1:574,7\n159#1:582,9\n159#1:591,6\n159#1:598,2\n159#1:603,17\n159#1:623,8\n159#1:631,6\n187#1:638\n187#1:639\n187#1:647\n187#1:651,12\n187#1:663\n187#1:664,5\n187#1:669,2\n187#1:671\n187#1:673,2\n187#1:678,17\n187#1:698,8\n187#1:706\n187#1:707,8\n187#1:715\n214#1:717\n214#1:718\n214#1:726\n214#1:730,12\n214#1:742\n214#1:743,5\n214#1:748,2\n214#1:750\n214#1:752,2\n214#1:757,17\n214#1:777,8\n214#1:785\n214#1:786,8\n214#1:794\n58#1:238\n70#1:304\n92#1:370\n111#1:436\n138#1:498\n159#1:569\n58#1:253\n70#1:319\n92#1:385\n111#1:451\n138#1:526\n159#1:597\n187#1:672\n214#1:751\n58#1:256,3\n58#1:279,3\n70#1:322,3\n70#1:345,3\n92#1:388,3\n92#1:411,3\n111#1:454,3\n111#1:477,3\n138#1:529,3\n138#1:549,3\n159#1:600,3\n159#1:620,3\n187#1:675,3\n187#1:695,3\n214#1:754,3\n214#1:774,3\n58#1:267\n58#1:268,2\n70#1:333\n70#1:334,2\n92#1:399\n92#1:400,2\n111#1:465\n111#1:466,2\n138#1:500\n138#1:501,2\n159#1:571\n159#1:572,2\n187#1:648\n187#1:649,2\n214#1:727\n214#1:728,2\n138#1:510\n159#1:581\n187#1:640,7\n214#1:719,7\n*E\n"})
public final class B0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Nullable
    public static final TraversableNode a(@NotNull InterfaceC2203g interfaceC2203g, @Nullable Object obj) {
        C2194b0 c2194b0;
        if (!interfaceC2203g.g0().f103127m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        p.d dVar = interfaceC2203g.g0().f103119e;
        LayoutNode layoutNodeR = C2204h.r(interfaceC2203g);
        while (layoutNodeR != null) {
            if ((layoutNodeR.f102729A.f103039e.f103118d & 262144) != 0) {
                while (dVar != null) {
                    if ((dVar.f103117c & 262144) != 0) {
                        p.d dVarL = dVar;
                        androidx.compose.runtime.collection.c cVar = null;
                        while (dVarL != 0) {
                            if (dVarL instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) dVarL;
                                if (kotlin.jvm.internal.G.g(obj, traversableNode.v1())) {
                                    return traversableNode;
                                }
                            } else if ((dVarL.f103117c & 262144) != 0 && (dVarL instanceof AbstractC2206j)) {
                                p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                                int i10 = 0;
                                dVarL = dVarL;
                                while (dVar2 != null) {
                                    if ((dVar2.f103117c & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarL = dVar2;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                            }
                                            if (dVarL != 0) {
                                                cVar.b(dVarL);
                                                dVarL = 0;
                                            }
                                            cVar.b(dVar2);
                                        }
                                    }
                                    dVar2 = dVar2.f103120f;
                                    dVarL = dVarL;
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarL = C2204h.l(cVar);
                        }
                    }
                    dVar = dVar.f103119e;
                }
            }
            layoutNodeR = layoutNodeR.D0();
            dVar = (layoutNodeR == null || (c2194b0 = layoutNodeR.f102729A) == null) ? null : c2194b0.f103038d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Nullable
    public static final <T extends TraversableNode> T b(@NotNull T t10) {
        C2194b0 c2194b0;
        if (!t10.g0().f103127m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        p.d dVar = t10.g0().f103119e;
        LayoutNode layoutNodeR = C2204h.r(t10);
        while (layoutNodeR != null) {
            if ((layoutNodeR.f102729A.f103039e.f103118d & 262144) != 0) {
                while (dVar != null) {
                    if ((dVar.f103117c & 262144) != 0) {
                        p.d dVarL = dVar;
                        androidx.compose.runtime.collection.c cVar = null;
                        while (dVarL != 0) {
                            if (dVarL instanceof TraversableNode) {
                                T t11 = (T) dVarL;
                                if (kotlin.jvm.internal.G.g(t10.v1(), t11.v1()) && androidx.compose.ui.b.a(t10, t11)) {
                                    return t11;
                                }
                            } else if ((dVarL.f103117c & 262144) != 0 && (dVarL instanceof AbstractC2206j)) {
                                p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                                int i10 = 0;
                                dVarL = dVarL;
                                while (dVar2 != null) {
                                    if ((dVar2.f103117c & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarL = dVar2;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                            }
                                            if (dVarL != 0) {
                                                cVar.b(dVarL);
                                                dVarL = 0;
                                            }
                                            cVar.b(dVar2);
                                        }
                                    }
                                    dVar2 = dVar2.f103120f;
                                    dVarL = dVarL;
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarL = C2204h.l(cVar);
                        }
                    }
                    dVar = dVar.f103119e;
                }
            }
            layoutNodeR = layoutNodeR.D0();
            dVar = (layoutNodeR == null || (c2194b0 = layoutNodeR.f102729A) == null) ? null : c2194b0.f103038d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    public static final void c(@NotNull InterfaceC2203g interfaceC2203g, @Nullable Object obj, @NotNull ed.l<? super TraversableNode, Boolean> lVar) {
        C2194b0 c2194b0;
        if (!interfaceC2203g.g0().f103127m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        p.d dVar = interfaceC2203g.g0().f103119e;
        LayoutNode layoutNodeR = C2204h.r(interfaceC2203g);
        while (layoutNodeR != null) {
            if ((layoutNodeR.f102729A.f103039e.f103118d & 262144) != 0) {
                while (dVar != null) {
                    if ((dVar.f103117c & 262144) != 0) {
                        p.d dVarL = dVar;
                        androidx.compose.runtime.collection.c cVar = null;
                        while (dVarL != 0) {
                            if (dVarL instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) dVarL;
                                if (!(kotlin.jvm.internal.G.g(obj, traversableNode.v1()) ? lVar.invoke(traversableNode).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((dVarL.f103117c & 262144) != 0) && (dVarL instanceof AbstractC2206j)) {
                                    p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                                    int i10 = 0;
                                    dVarL = dVarL;
                                    while (dVar2 != null) {
                                        if ((dVar2.f103117c & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                dVarL = dVar2;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                }
                                                if (dVarL != 0) {
                                                    cVar.b(dVarL);
                                                    dVarL = 0;
                                                }
                                                cVar.b(dVar2);
                                            }
                                        }
                                        dVar2 = dVar2.f103120f;
                                        dVarL = dVarL;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            dVarL = C2204h.l(cVar);
                        }
                    }
                    dVar = dVar.f103119e;
                }
            }
            layoutNodeR = layoutNodeR.D0();
            dVar = (layoutNodeR == null || (c2194b0 = layoutNodeR.f102729A) == null) ? null : c2194b0.f103038d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    public static final <T extends TraversableNode> void d(@NotNull T t10, @NotNull ed.l<? super T, Boolean> lVar) {
        C2194b0 c2194b0;
        if (!t10.g0().f103127m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        p.d dVar = t10.g0().f103119e;
        LayoutNode layoutNodeR = C2204h.r(t10);
        while (layoutNodeR != null) {
            if ((layoutNodeR.f102729A.f103039e.f103118d & 262144) != 0) {
                while (dVar != null) {
                    if ((dVar.f103117c & 262144) != 0) {
                        p.d dVarL = dVar;
                        androidx.compose.runtime.collection.c cVar = null;
                        while (dVarL != 0) {
                            boolean zBooleanValue = true;
                            if (dVarL instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) dVarL;
                                if (kotlin.jvm.internal.G.g(t10.v1(), traversableNode.v1()) && androidx.compose.ui.b.a(t10, traversableNode)) {
                                    zBooleanValue = lVar.invoke(traversableNode).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((dVarL.f103117c & 262144) != 0) && (dVarL instanceof AbstractC2206j)) {
                                    p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                                    int i10 = 0;
                                    dVarL = dVarL;
                                    while (dVar2 != null) {
                                        if ((dVar2.f103117c & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                dVarL = dVar2;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                }
                                                if (dVarL != 0) {
                                                    cVar.b(dVarL);
                                                    dVarL = 0;
                                                }
                                                cVar.b(dVar2);
                                            }
                                        }
                                        dVar2 = dVar2.f103120f;
                                        dVarL = dVarL;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            dVarL = C2204h.l(cVar);
                        }
                    }
                    dVar = dVar.f103119e;
                }
            }
            layoutNodeR = layoutNodeR.D0();
            dVar = (layoutNodeR == null || (c2194b0 = layoutNodeR.f102729A) == null) ? null : c2194b0.f103038d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0025, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.InterfaceC2203g r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.NotNull ed.l<? super androidx.compose.ui.node.TraversableNode, java.lang.Boolean> r12) {
        /*
            androidx.compose.ui.p$d r0 = r10.g0()
            boolean r0 = r0.f103127m
            if (r0 == 0) goto Lb1
            androidx.compose.runtime.collection.c r0 = new androidx.compose.runtime.collection.c
            r1 = 16
            androidx.compose.ui.p$d[] r2 = new androidx.compose.ui.p.d[r1]
            r3 = 0
            r0.<init>(r2, r3)
            androidx.compose.ui.p$d r2 = r10.g0()
            androidx.compose.ui.p$d r2 = r2.f103120f
            if (r2 != 0) goto L22
            androidx.compose.ui.p$d r10 = r10.g0()
            androidx.compose.ui.node.C2204h.c(r0, r10)
            goto L25
        L22:
            r0.b(r2)
        L25:
            boolean r10 = r0.V()
            if (r10 == 0) goto Lb0
            int r10 = r0.f99566c
            r2 = 1
            int r10 = r10 - r2
            java.lang.Object r10 = r0.l0(r10)
            androidx.compose.ui.p$d r10 = (androidx.compose.ui.p.d) r10
            int r4 = r10.f103118d
            r5 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 & r5
            if (r4 != 0) goto L40
            androidx.compose.ui.node.C2204h.c(r0, r10)
            goto L25
        L40:
            if (r10 == 0) goto L25
            int r4 = r10.f103117c
            r4 = r4 & r5
            if (r4 == 0) goto Lad
            r4 = 0
            r6 = r4
        L49:
            if (r10 == 0) goto L25
            boolean r7 = r10 instanceof androidx.compose.ui.node.TraversableNode
            if (r7 == 0) goto L6a
            androidx.compose.ui.node.TraversableNode r10 = (androidx.compose.ui.node.TraversableNode) r10
            java.lang.Object r7 = r10.v1()
            boolean r7 = kotlin.jvm.internal.G.g(r11, r7)
            if (r7 == 0) goto L66
            java.lang.Object r10 = r12.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            goto L67
        L66:
            r10 = r2
        L67:
            if (r10 != 0) goto La8
            goto Lb0
        L6a:
            int r7 = r10.f103117c
            r7 = r7 & r5
            if (r7 == 0) goto L71
            r7 = r2
            goto L72
        L71:
            r7 = r3
        L72:
            if (r7 == 0) goto La8
            boolean r7 = r10 instanceof androidx.compose.ui.node.AbstractC2206j
            if (r7 == 0) goto La8
            r7 = r10
            androidx.compose.ui.node.j r7 = (androidx.compose.ui.node.AbstractC2206j) r7
            androidx.compose.ui.p$d r7 = r7.f103066p
            r8 = r3
        L7e:
            if (r7 == 0) goto La5
            int r9 = r7.f103117c
            r9 = r9 & r5
            if (r9 == 0) goto L87
            r9 = r2
            goto L88
        L87:
            r9 = r3
        L88:
            if (r9 == 0) goto La2
            int r8 = r8 + 1
            if (r8 != r2) goto L90
            r10 = r7
            goto La2
        L90:
            if (r6 != 0) goto L99
            androidx.compose.runtime.collection.c r6 = new androidx.compose.runtime.collection.c
            androidx.compose.ui.p$d[] r9 = new androidx.compose.ui.p.d[r1]
            r6.<init>(r9, r3)
        L99:
            if (r10 == 0) goto L9f
            r6.b(r10)
            r10 = r4
        L9f:
            r6.b(r7)
        La2:
            androidx.compose.ui.p$d r7 = r7.f103120f
            goto L7e
        La5:
            if (r8 != r2) goto La8
            goto L49
        La8:
            androidx.compose.ui.p$d r10 = androidx.compose.ui.node.C2204h.l(r6)
            goto L49
        Lad:
            androidx.compose.ui.p$d r10 = r10.f103120f
            goto L40
        Lb0:
            return
        Lb1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "visitChildren called on an unattached node"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.B0.e(androidx.compose.ui.node.g, java.lang.Object, ed.l):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0025, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void f(@org.jetbrains.annotations.NotNull T r11, @org.jetbrains.annotations.NotNull ed.l<? super T, java.lang.Boolean> r12) {
        /*
            androidx.compose.ui.p$d r0 = r11.g0()
            boolean r0 = r0.f103127m
            if (r0 == 0) goto Lbb
            androidx.compose.runtime.collection.c r0 = new androidx.compose.runtime.collection.c
            r1 = 16
            androidx.compose.ui.p$d[] r2 = new androidx.compose.ui.p.d[r1]
            r3 = 0
            r0.<init>(r2, r3)
            androidx.compose.ui.p$d r2 = r11.g0()
            androidx.compose.ui.p$d r2 = r2.f103120f
            if (r2 != 0) goto L22
            androidx.compose.ui.p$d r2 = r11.g0()
            androidx.compose.ui.node.C2204h.c(r0, r2)
            goto L25
        L22:
            r0.b(r2)
        L25:
            boolean r2 = r0.V()
            if (r2 == 0) goto Lba
            int r2 = r0.f99566c
            r4 = 1
            int r2 = r2 - r4
            java.lang.Object r2 = r0.l0(r2)
            androidx.compose.ui.p$d r2 = (androidx.compose.ui.p.d) r2
            int r5 = r2.f103118d
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L40
            androidx.compose.ui.node.C2204h.c(r0, r2)
            goto L25
        L40:
            if (r2 == 0) goto L25
            int r5 = r2.f103117c
            r5 = r5 & r6
            if (r5 == 0) goto Lb7
            r5 = 0
            r7 = r5
        L49:
            if (r2 == 0) goto L25
            boolean r8 = r2 instanceof androidx.compose.ui.node.TraversableNode
            if (r8 == 0) goto L74
            androidx.compose.ui.node.TraversableNode r2 = (androidx.compose.ui.node.TraversableNode) r2
            java.lang.Object r8 = r11.v1()
            java.lang.Object r9 = r2.v1()
            boolean r8 = kotlin.jvm.internal.G.g(r8, r9)
            if (r8 == 0) goto L70
            boolean r8 = androidx.compose.ui.b.a(r11, r2)
            if (r8 == 0) goto L70
            java.lang.Object r2 = r12.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L71
        L70:
            r2 = r4
        L71:
            if (r2 != 0) goto Lb2
            goto Lba
        L74:
            int r8 = r2.f103117c
            r8 = r8 & r6
            if (r8 == 0) goto L7b
            r8 = r4
            goto L7c
        L7b:
            r8 = r3
        L7c:
            if (r8 == 0) goto Lb2
            boolean r8 = r2 instanceof androidx.compose.ui.node.AbstractC2206j
            if (r8 == 0) goto Lb2
            r8 = r2
            androidx.compose.ui.node.j r8 = (androidx.compose.ui.node.AbstractC2206j) r8
            androidx.compose.ui.p$d r8 = r8.f103066p
            r9 = r3
        L88:
            if (r8 == 0) goto Laf
            int r10 = r8.f103117c
            r10 = r10 & r6
            if (r10 == 0) goto L91
            r10 = r4
            goto L92
        L91:
            r10 = r3
        L92:
            if (r10 == 0) goto Lac
            int r9 = r9 + 1
            if (r9 != r4) goto L9a
            r2 = r8
            goto Lac
        L9a:
            if (r7 != 0) goto La3
            androidx.compose.runtime.collection.c r7 = new androidx.compose.runtime.collection.c
            androidx.compose.ui.p$d[] r10 = new androidx.compose.ui.p.d[r1]
            r7.<init>(r10, r3)
        La3:
            if (r2 == 0) goto La9
            r7.b(r2)
            r2 = r5
        La9:
            r7.b(r8)
        Lac:
            androidx.compose.ui.p$d r8 = r8.f103120f
            goto L88
        Laf:
            if (r9 != r4) goto Lb2
            goto L49
        Lb2:
            androidx.compose.ui.p$d r2 = androidx.compose.ui.node.C2204h.l(r7)
            goto L49
        Lb7:
            androidx.compose.ui.p$d r2 = r2.f103120f
            goto L40
        Lba:
            return
        Lbb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "visitChildren called on an unattached node"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.B0.f(androidx.compose.ui.node.TraversableNode, ed.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    public static final void g(@NotNull InterfaceC2203g interfaceC2203g, @Nullable Object obj, @NotNull ed.l<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        if (!interfaceC2203g.g0().f103127m) {
            W.a.g("visitSubtreeIf called on an unattached node");
            throw null;
        }
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
        p.d dVar = interfaceC2203g.g0().f103120f;
        if (dVar == null) {
            C2204h.c(cVar, interfaceC2203g.g0());
        } else {
            cVar.b(dVar);
        }
        while (cVar.V()) {
            p.d dVar2 = (p.d) cVar.l0(cVar.f99566c - 1);
            if ((dVar2.f103118d & 262144) != 0) {
                for (p.d dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.f103120f) {
                    if ((dVar3.f103117c & 262144) != 0) {
                        androidx.compose.runtime.collection.c cVar2 = null;
                        p.d dVarL = dVar3;
                        while (dVarL != 0) {
                            if (dVarL instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) dVarL;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsActionInvoke = kotlin.jvm.internal.G.g(obj, traversableNode.v1()) ? lVar.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((dVarL.f103117c & 262144) != 0 && (dVarL instanceof AbstractC2206j)) {
                                p.d dVar4 = ((AbstractC2206j) dVarL).f103066p;
                                int i10 = 0;
                                dVarL = dVarL;
                                while (dVar4 != null) {
                                    if ((dVar4.f103117c & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarL = dVar4;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                            }
                                            if (dVarL != 0) {
                                                cVar2.b(dVarL);
                                                dVarL = 0;
                                            }
                                            cVar2.b(dVar4);
                                        }
                                    }
                                    dVar4 = dVar4.f103120f;
                                    dVarL = dVarL;
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarL = C2204h.l(cVar2);
                        }
                    }
                }
            }
            C2204h.c(cVar, dVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    public static final <T extends TraversableNode> void h(@NotNull T t10, @NotNull ed.l<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        if (!t10.g0().f103127m) {
            W.a.g("visitSubtreeIf called on an unattached node");
            throw null;
        }
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
        p.d dVar = t10.g0().f103120f;
        if (dVar == null) {
            C2204h.c(cVar, t10.g0());
        } else {
            cVar.b(dVar);
        }
        while (cVar.V()) {
            p.d dVar2 = (p.d) cVar.l0(cVar.f99566c - 1);
            if ((dVar2.f103118d & 262144) != 0) {
                for (p.d dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.f103120f) {
                    if ((dVar3.f103117c & 262144) != 0) {
                        androidx.compose.runtime.collection.c cVar2 = null;
                        p.d dVarL = dVar3;
                        while (dVarL != 0) {
                            if (dVarL instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) dVarL;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsActionInvoke = (kotlin.jvm.internal.G.g(t10.v1(), traversableNode.v1()) && androidx.compose.ui.b.a(t10, traversableNode)) ? lVar.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((dVarL.f103117c & 262144) != 0 && (dVarL instanceof AbstractC2206j)) {
                                p.d dVar4 = ((AbstractC2206j) dVarL).f103066p;
                                int i10 = 0;
                                dVarL = dVarL;
                                while (dVar4 != null) {
                                    if ((dVar4.f103117c & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarL = dVar4;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                            }
                                            if (dVarL != 0) {
                                                cVar2.b(dVarL);
                                                dVarL = 0;
                                            }
                                            cVar2.b(dVar4);
                                        }
                                    }
                                    dVar4 = dVar4.f103120f;
                                    dVarL = dVarL;
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarL = C2204h.l(cVar2);
                        }
                    }
                }
            }
            C2204h.c(cVar, dVar2);
        }
    }
}
