package com.github.appintro.internal;

import androidx.compose.animation.C1635o;
import androidx.compose.animation.C1636p;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionWrapper implements Serializable {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    @NotNull
    private String[] permissions;
    private int position;
    private boolean required;

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        private Companion() {
        }
    }

    public PermissionWrapper(@NotNull String[] permissions, int i10, boolean z10) {
        G.p(permissions, "permissions");
        this.permissions = permissions;
        this.position = i10;
        this.required = z10;
    }

    public static /* synthetic */ PermissionWrapper copy$default(PermissionWrapper permissionWrapper, String[] strArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            strArr = permissionWrapper.permissions;
        }
        if ((i11 & 2) != 0) {
            i10 = permissionWrapper.position;
        }
        if ((i11 & 4) != 0) {
            z10 = permissionWrapper.required;
        }
        return permissionWrapper.copy(strArr, i10, z10);
    }

    @NotNull
    public final String[] component1() {
        return this.permissions;
    }

    public final int component2() {
        return this.position;
    }

    public final boolean component3() {
        return this.required;
    }

    @NotNull
    public final PermissionWrapper copy(@NotNull String[] permissions, int i10, boolean z10) {
        G.p(permissions, "permissions");
        return new PermissionWrapper(permissions, i10, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PermissionWrapper.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.github.appintro.internal.PermissionWrapper");
        }
        PermissionWrapper permissionWrapper = (PermissionWrapper) obj;
        return Arrays.equals(this.permissions, permissionWrapper.permissions) && this.position == permissionWrapper.position && this.required == permissionWrapper.required;
    }

    @NotNull
    public final String[] getPermissions() {
        return this.permissions;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return C1635o.a(this.required) + (((Arrays.hashCode(this.permissions) * 31) + this.position) * 31);
    }

    public final void setPermissions(@NotNull String[] strArr) {
        G.p(strArr, "<set-?>");
        this.permissions = strArr;
    }

    public final void setPosition(int i10) {
        this.position = i10;
    }

    public final void setRequired(boolean z10) {
        this.required = z10;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionWrapper(permissions=");
        sb2.append(Arrays.toString(this.permissions));
        sb2.append(", position=");
        sb2.append(this.position);
        sb2.append(", required=");
        return C1636p.a(sb2, this.required, ')');
    }

    public /* synthetic */ PermissionWrapper(String[] strArr, int i10, boolean z10, int i11, C4969v c4969v) {
        this(strArr, i10, (i11 & 4) != 0 ? true : z10);
    }
}
