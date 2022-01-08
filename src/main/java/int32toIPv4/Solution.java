/*
Take the following IPv4 address: 128.32.10.1
This address has 4 octets where each octet is a single byte (or 8 bits).
1st octet 128 has the binary representation: 10000000
2nd octet 32 has the binary representation: 00100000
3rd octet 10 has the binary representation: 00001010
4th octet 1 has the binary representation: 00000001
So 128.32.10.1 == 10000000.00100000.00001010.00000001
Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361
Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.
*/

package int32toIPv4;

public class Solution {

    public static String longToIP(long ip) {

        final int MASK1 = 0b00000000_00000000_00000000_11111111;
        final int MASK2 = 0b00000000_00000000_11111111_00000000;
        final int MASK3 = 0b00000000_11111111_00000000_00000000;
        final int MASK4 = 0b11111111_00000000_00000000_00000000;

        long octet1 = ip & MASK1;
        long octet2 = (ip & MASK2) >> 8;
        long octet3 = (ip & MASK3) >> 16;
        long octet4 = (ip & MASK4) >> 24;

        return octet4 + "." + octet3 + "." + octet2 + "." + octet1;
    }
}
