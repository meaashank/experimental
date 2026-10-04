package org.objectweb.asm.signature;

/* JADX INFO: loaded from: classes8.dex */
public class SignatureReader {
    private final String signatureValue;

    public SignatureReader(String str) {
        this.signatureValue = str;
    }

    private static int parseType(String str, int i10, SignatureVisitor signatureVisitor) {
        int i11;
        char cCharAt;
        int type = i10 + 1;
        char cCharAt2 = str.charAt(i10);
        if (cCharAt2 != 'F') {
            if (cCharAt2 == 'L') {
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int i12 = type;
                    while (true) {
                        i11 = type + 1;
                        cCharAt = str.charAt(type);
                        if (cCharAt == '.' || cCharAt == ';') {
                            break;
                        }
                        if (cCharAt == '<') {
                            String strSubstring = str.substring(i12, type);
                            if (z11) {
                                signatureVisitor.visitInnerClassType(strSubstring);
                            } else {
                                signatureVisitor.visitClassType(strSubstring);
                            }
                            type = i11;
                            while (true) {
                                char cCharAt3 = str.charAt(type);
                                if (cCharAt3 == '>') {
                                    break;
                                }
                                if (cCharAt3 != '*') {
                                    type = (cCharAt3 == '+' || cCharAt3 == '-') ? parseType(str, type + 1, signatureVisitor.visitTypeArgument(cCharAt3)) : parseType(str, type, signatureVisitor.visitTypeArgument(SignatureVisitor.INSTANCEOF));
                                } else {
                                    type++;
                                    signatureVisitor.visitTypeArgument();
                                }
                            }
                            z10 = true;
                        } else {
                            type = i11;
                        }
                    }
                    if (!z10) {
                        String strSubstring2 = str.substring(i12, type);
                        if (z11) {
                            signatureVisitor.visitInnerClassType(strSubstring2);
                        } else {
                            signatureVisitor.visitClassType(strSubstring2);
                        }
                    }
                    if (cCharAt == ';') {
                        signatureVisitor.visitEnd();
                        return i11;
                    }
                    z10 = false;
                    z11 = true;
                    type = i11;
                }
            } else if (cCharAt2 != 'V' && cCharAt2 != 'I' && cCharAt2 != 'J' && cCharAt2 != 'S') {
                if (cCharAt2 == 'T') {
                    int iIndexOf = str.indexOf(59, type);
                    signatureVisitor.visitTypeVariable(str.substring(type, iIndexOf));
                    return iIndexOf + 1;
                }
                if (cCharAt2 != 'Z') {
                    if (cCharAt2 == '[') {
                        return parseType(str, type, signatureVisitor.visitArrayType());
                    }
                    switch (cCharAt2) {
                        case 'B':
                        case 'C':
                        case 'D':
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        signatureVisitor.visitBaseType(cCharAt2);
        return type;
    }

    public void accept(SignatureVisitor signatureVisitor) {
        char cCharAt;
        String str = this.signatureValue;
        int length = str.length();
        int i10 = 0;
        if (str.charAt(0) == '<') {
            i10 = 2;
            do {
                int iIndexOf = str.indexOf(58, i10);
                signatureVisitor.visitFormalTypeParameter(str.substring(i10 - 1, iIndexOf));
                int type = iIndexOf + 1;
                char cCharAt2 = str.charAt(type);
                if (cCharAt2 == 'L' || cCharAt2 == '[' || cCharAt2 == 'T') {
                    type = parseType(str, type, signatureVisitor.visitClassBound());
                }
                while (true) {
                    i10 = type + 1;
                    cCharAt = str.charAt(type);
                    if (cCharAt != ':') {
                        break;
                    } else {
                        type = parseType(str, i10, signatureVisitor.visitInterfaceBound());
                    }
                }
            } while (cCharAt != '>');
        }
        if (str.charAt(i10) != '(') {
            int type2 = parseType(str, i10, signatureVisitor.visitSuperclass());
            while (type2 < length) {
                type2 = parseType(str, type2, signatureVisitor.visitInterface());
            }
        } else {
            int type3 = i10 + 1;
            while (str.charAt(type3) != ')') {
                type3 = parseType(str, type3, signatureVisitor.visitParameterType());
            }
            int type4 = parseType(str, type3 + 1, signatureVisitor.visitReturnType());
            while (type4 < length) {
                type4 = parseType(str, type4 + 1, signatureVisitor.visitExceptionType());
            }
        }
    }

    public void acceptType(SignatureVisitor signatureVisitor) {
        parseType(this.signatureValue, 0, signatureVisitor);
    }
}
