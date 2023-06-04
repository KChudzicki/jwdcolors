package pl.edu.wszib.jwd.jwdcolors.servie;

import org.springframework.stereotype.Service;
import pl.edu.wszib.jwd.jwdcolors.model.SelectedColor;

import java.util.List;

@Service
public interface SelectedColorService {
    void save(String color);
    void save(SelectedColor selectedColor);
    List<SelectedColor> getAllData();
    }
