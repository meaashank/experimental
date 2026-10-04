package com.prism.lib.pfs;

import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.compat.PfsCompatType;
import o6.InterfaceC5331d;

/* JADX INFO: loaded from: classes7.dex */
public class b implements PrivateFileSystem.d {
    public void a() {
    }

    @Override // com.prism.lib.pfs.PrivateFileSystem.d
    public void b(PfsCompatType pfsCompatType, String str, InterfaceC5331d interfaceC5331d) {
        interfaceC5331d.a();
    }

    @Override // com.prism.lib.pfs.PrivateFileSystem.d
    public void c(PrivateFileSystem.MountResultCode mountResultCode) {
        PrivateFileSystem.MountResultCode mountResultCode2 = PrivateFileSystem.MountResultCode.SUCCESS;
    }

    public void d() {
    }
}
