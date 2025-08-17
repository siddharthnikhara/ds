package com;

import java.util.*;

public class IPRangePrinter {

    public static void main(String[] args) {
        String startIP = "192.168.10.1";
        String endIP = "200.10.98.10";

        long start = ipToLong(startIP);
        long end = ipToLong(endIP);

        if (start > end) {
            long temp = start;
            start = end;
            end = temp;
        }

        for (long ipNum = start; ipNum <= end; ipNum++) {
            System.out.println(longToIp(ipNum));
        }
    }

    // Convert IP to long
    private static long ipToLong(String ip) {
        String[] parts = ip.split("\\.");
        long result = 0;
        for (String part : parts) {
            result = result << 8 | Integer.parseInt(part);
        }
        return result;
    }

    // Convert long back to IP
    private static String longToIp(long ipNum) {
        return String.format("%d.%d.%d.%d",
                (ipNum >> 24) & 0xFF,
                (ipNum >> 16) & 0xFF,
                (ipNum >> 8) & 0xFF,
                ipNum & 0xFF);
    }
}
