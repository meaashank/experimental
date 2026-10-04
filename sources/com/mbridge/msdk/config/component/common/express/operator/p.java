package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f154290a;

    public p(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f154290a = cVar;
    }

    private Object a(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" and (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(C4.q.f17581a);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        sb2.append(" )");
        return sb2.toString();
    }

    private Object b() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String());
    }

    private Object c(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" group by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(C4.q.f17581a);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[PHI: r2
      0x0030: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v12 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object d(java.lang.String r5, java.lang.Object r6, java.util.List<java.lang.Object> r7) {
        /*
            r4 = this;
            r5 = 0
            if (r6 == 0) goto Lc0
            if (r7 != 0) goto L7
            goto Lc0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.<init>(r6)
            int r6 = r7.size()
            r1 = 2
            java.lang.String r2 = ""
            if (r6 != r1) goto L30
            r6 = 0
            java.lang.Object r6 = r7.get(r6)
            if (r6 == 0) goto L24
            java.lang.String r2 = java.lang.String.valueOf(r6)
        L24:
            r6 = 1
            java.lang.Object r6 = r7.get(r6)
            boolean r7 = r6 instanceof java.util.Map
            if (r7 == 0) goto L30
            java.util.Map r6 = (java.util.Map) r6
            goto L31
        L30:
            r6 = r5
        L31:
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            if (r7 != 0) goto Lbb
            if (r6 != 0) goto L3b
            goto Lbb
        L3b:
            java.lang.String r5 = " insert into "
            java.lang.String r5 = r5.concat(r2)
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = " ("
            r5.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = " VALUES ("
            r7.<init>(r1)
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L5a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La8
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.get(r2)
            r5.append(r2)
            if (r3 != 0) goto L75
            java.lang.String r2 = "NULL"
            r7.append(r2)
            goto L90
        L75:
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L7d
            r7.append(r3)
            goto L90
        L7d:
            java.lang.String r2 = "'"
            r7.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r4.a(r3)
            r7.append(r3)
            r7.append(r2)
        L90:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9f
            java.lang.String r2 = ","
            r5.append(r2)
            r7.append(r2)
            goto L5a
        L9f:
            java.lang.String r2 = " )"
            r5.append(r2)
            r7.append(r2)
            goto L5a
        La8:
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            java.lang.String r5 = r7.toString()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        Lbb:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r5)
            return r5
        Lc0:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.p.d(java.lang.String, java.lang.Object, java.util.List):java.lang.Object");
    }

    private Object e(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" limit");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(C4.q.f17581a);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private Object f(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" or (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(C4.q.f17581a);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        sb2.append(" )");
        return sb2.toString();
    }

    private Object g(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" order by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(C4.q.f17581a);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("829")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b()) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("830")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(j(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("831")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("832")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(l(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("833")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("834")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(f(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("835")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(g(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("836")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("837")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a()) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("838")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("839")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(d(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("840")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(e(str, obj, list)) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e10) {
            q0.b("SQLOperator", e10.getMessage(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Object j(String str, Object obj, List<Object> list) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder("select");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(C4.q.f17581a);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[PHI: r2
      0x0030: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object k(java.lang.String r4, java.lang.Object r5, java.util.List<java.lang.Object> r6) {
        /*
            r3 = this;
            r4 = 0
            if (r5 == 0) goto L7f
            if (r6 != 0) goto L7
            goto L7f
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.<init>(r5)
            int r5 = r6.size()
            r1 = 2
            java.lang.String r2 = ""
            if (r5 != r1) goto L30
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            if (r5 == 0) goto L24
            java.lang.String r2 = java.lang.String.valueOf(r5)
        L24:
            r5 = 1
            java.lang.Object r5 = r6.get(r5)
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L30
            java.util.Map r5 = (java.util.Map) r5
            goto L31
        L30:
            r5 = r4
        L31:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L7a
            if (r5 != 0) goto L3a
            goto L7a
        L3a:
            java.lang.String r4 = "update "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = " set"
            r0.append(r4)
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L4f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L75
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = " "
            java.lang.String r2 = "="
            androidx.concurrent.futures.b.a(r0, r1, r6, r2)
            java.lang.Object r6 = r5.get(r6)
            r0.append(r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4f
            java.lang.String r6 = ","
            r0.append(r6)
            goto L4f
        L75:
            java.lang.String r4 = r0.toString()
            return r4
        L7a:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r4 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r4)
            return r4
        L7f:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r4 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.p.k(java.lang.String, java.lang.Object, java.util.List):java.lang.Object");
    }

    private Object l(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" where");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(C4.q.f17581a);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a i(String str, Object obj, List<Object> list) {
        return b(str) ? h(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object b(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" from");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(C4.q.f17581a);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private Object a() {
        return new StringBuilder(" delete ");
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("829")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("830")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("831")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("832")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("833")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("834")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("835")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("836")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("837")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("838")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("839")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("840"));
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("'", "''");
    }
}
