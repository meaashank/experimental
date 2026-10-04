package com.prism.lib.pfs;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import c6.C2947b;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.compat.PfsCompatType;
import com.prism.lib.pfs.d;
import java.io.File;
import o6.InterfaceC5331d;
import o6.g;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements PrivateFileSystem.d, g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f183655c = l0.b(a.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrivateFileSystem f183656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f183657b;

    public a(PrivateFileSystem privateFileSystem, Context context) {
        this.f183656a = privateFileSystem;
        this.f183657b = context;
    }

    public static /* synthetic */ void d(InterfaceC5331d interfaceC5331d, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        interfaceC5331d.stop();
    }

    @Override // com.prism.lib.pfs.PrivateFileSystem.d
    public void b(PfsCompatType pfsCompatType, String str, final InterfaceC5331d interfaceC5331d) {
        String strF = f(pfsCompatType, str);
        I.b(f183655c, "onNeedPermissions mesg: %s", strF);
        if (strF == null) {
            interfaceC5331d.a();
        } else {
            new AlertDialog.Builder(this.f183657b).setMessage(strF).setPositiveButton(C2947b.m.f129670v2, new DialogInterface.OnClickListener() { // from class: La.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    interfaceC5331d.a();
                }
            }).setNegativeButton(C2947b.m.f129666u2, new DialogInterface.OnClickListener() { // from class: La.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    com.prism.lib.pfs.a.d(interfaceC5331d, dialogInterface, i10);
                }
            }).create().show();
        }
    }

    @Override // com.prism.lib.pfs.PrivateFileSystem.d
    public void c(PrivateFileSystem.MountResultCode mountResultCode) {
        if (mountResultCode == PrivateFileSystem.MountResultCode.SUCCESS) {
            onSuccess();
        } else {
            a();
        }
    }

    public String f(PfsCompatType pfsCompatType, String str) {
        if (this.f183656a.getFileEncryptType() == -1) {
            return PrivateFileSystem.getAppContext().getString(pfsCompatType == PfsCompatType.SAF ? d.p.f187155V3 : d.p.f187150U3, str);
        }
        if (new File(this.f183656a.getTargetResidePath()).exists()) {
            return PrivateFileSystem.getAppContext().getString(pfsCompatType == PfsCompatType.SAF ? d.p.f187140S3 : d.p.f187135R3, str);
        }
        return PrivateFileSystem.getAppContext().getString(pfsCompatType == PfsCompatType.SAF ? d.p.f187181a4 : d.p.f187170Y3, str);
    }
}
