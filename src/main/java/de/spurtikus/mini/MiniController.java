package de.spurtikus.mini;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class MiniController {
    private static final String template = "Hello, %s!";
    
    @RequestMapping("/echo")
    public String hello(@RequestParam(value="name", defaultValue="World") String name) {
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