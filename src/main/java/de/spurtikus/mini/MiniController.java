package de.spurtikus.mini;

import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class MiniController {
    private static final String template = "Echo says: %s";
    
    @RequestMapping(value = "/echo/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name) {
        return String.format(template, name);
    }

    @RequestMapping("/route")
    public String route() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        StringBuilder sb = new StringBuilder();
        sb.append("{ip:");
        sb.append(ip.getHostAddress());
        sb.append(", host:");
        sb.append(ip.getHostName());
        sb.append(",[");
        for (InetAddress adr : ip.getAllByName(ip.getHostName())) {
        	sb.append(adr.getHostAddress());
        	sb.append(",");
        }
        sb.append("]}");
        return sb.toString();
    }

}