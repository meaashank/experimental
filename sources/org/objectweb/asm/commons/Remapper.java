package org.objectweb.asm.commons;

import androidx.compose.ui.tooling.data.k;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.signature.SignatureReader;
import org.objectweb.asm.signature.SignatureVisitor;
import org.objectweb.asm.signature.SignatureWriter;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Remapper {
    private Type mapType(Type type) {
        switch (type.getSort()) {
            case 9:
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < type.getDimensions(); i10++) {
                    sb2.append('[');
                }
                sb2.append(mapType(type.getElementType()).getDescriptor());
                return Type.getType(sb2.toString());
            case 10:
                String map = map(type.getInternalName());
                return map != null ? Type.getObjectType(map) : type;
            case 11:
                return Type.getMethodType(mapMethodDesc(type.getDescriptor()));
            default:
                return type;
        }
    }

    @Deprecated
    public SignatureVisitor createRemappingSignatureAdapter(SignatureVisitor signatureVisitor) {
        return createSignatureRemapper(signatureVisitor);
    }

    public SignatureVisitor createSignatureRemapper(SignatureVisitor signatureVisitor) {
        return new SignatureRemapper(signatureVisitor, this);
    }

    public String map(String str) {
        return str;
    }

    public String mapAnnotationAttributeName(String str, String str2) {
        return str2;
    }

    public String mapDesc(String str) {
        return mapType(Type.getType(str)).getDescriptor();
    }

    public String mapFieldName(String str, String str2, String str3) {
        return str2;
    }

    public String mapInnerClassName(String str, String str2, String str3) {
        String strMapType = mapType(str);
        if (!strMapType.contains(k.f105391d)) {
            return str3;
        }
        int iLastIndexOf = strMapType.lastIndexOf(36);
        do {
            iLastIndexOf++;
            if (iLastIndexOf >= strMapType.length()) {
                break;
            }
        } while (Character.isDigit(strMapType.charAt(iLastIndexOf)));
        return strMapType.substring(iLastIndexOf);
    }

    public String mapInvokeDynamicMethodName(String str, String str2) {
        return str;
    }

    public String mapMethodDesc(String str) {
        if ("()V".equals(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("(");
        for (Type type : Type.getArgumentTypes(str)) {
            sb2.append(mapType(type).getDescriptor());
        }
        Type returnType = Type.getReturnType(str);
        if (returnType == Type.VOID_TYPE) {
            sb2.append(")V");
        } else {
            sb2.append(')');
            sb2.append(mapType(returnType).getDescriptor());
        }
        return sb2.toString();
    }

    public String mapMethodName(String str, String str2, String str3) {
        return str2;
    }

    public String mapModuleName(String str) {
        return str;
    }

    public String mapPackageName(String str) {
        return str;
    }

    public String mapRecordComponentName(String str, String str2, String str3) {
        return str2;
    }

    public String mapSignature(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        SignatureReader signatureReader = new SignatureReader(str);
        SignatureWriter signatureWriter = new SignatureWriter();
        SignatureVisitor signatureVisitorCreateSignatureRemapper = createSignatureRemapper(signatureWriter);
        if (z10) {
            signatureReader.acceptType(signatureVisitorCreateSignatureRemapper);
        } else {
            signatureReader.accept(signatureVisitorCreateSignatureRemapper);
        }
        return signatureWriter.toString();
    }

    public String[] mapTypes(String[] strArr) {
        String[] strArr2 = null;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String strMapType = mapType(strArr[i10]);
            if (strMapType != null) {
                if (strArr2 == null) {
                    strArr2 = (String[]) strArr.clone();
                }
                strArr2[i10] = strMapType;
            }
        }
        return strArr2 != null ? strArr2 : strArr;
    }

    public Object mapValue(Object obj) {
        if (obj instanceof Type) {
            return mapType((Type) obj);
        }
        if (obj instanceof Handle) {
            Handle handle = (Handle) obj;
            return new Handle(handle.getTag(), mapType(handle.getOwner()), mapMethodName(handle.getOwner(), handle.getName(), handle.getDesc()), handle.getTag() <= 4 ? mapDesc(handle.getDesc()) : mapMethodDesc(handle.getDesc()), handle.isInterface());
        }
        if (!(obj instanceof ConstantDynamic)) {
            return obj;
        }
        ConstantDynamic constantDynamic = (ConstantDynamic) obj;
        int bootstrapMethodArgumentCount = constantDynamic.getBootstrapMethodArgumentCount();
        Object[] objArr = new Object[bootstrapMethodArgumentCount];
        for (int i10 = 0; i10 < bootstrapMethodArgumentCount; i10++) {
            objArr[i10] = mapValue(constantDynamic.getBootstrapMethodArgument(i10));
        }
        String descriptor = constantDynamic.getDescriptor();
        return new ConstantDynamic(mapInvokeDynamicMethodName(constantDynamic.getName(), descriptor), mapDesc(descriptor), (Handle) mapValue(constantDynamic.getBootstrapMethod()), objArr);
    }

    public String mapType(String str) {
        if (str == null) {
            return null;
        }
        return mapType(Type.getObjectType(str)).getInternalName();
    }
}
