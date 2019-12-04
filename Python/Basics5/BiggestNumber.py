float1 = float(raw_input("First Float:\t"))
float2 = float(raw_input("Second Float:\t"))
float3 = float(raw_input("Third Float:\t"))

def findGreatest(fl1, fl2, fl3):
    if fl1 > fl2 and fl1 > fl3:
        return fl1
    if fl2 > fl1 and fl2 > fl3:
        return fl2
    if fl3 > fl1 and fl3 > fl2:
        return fl3
    return "two or more of the floats were equal and the greatest value"

print findGreatest(float1, float2, float3)

