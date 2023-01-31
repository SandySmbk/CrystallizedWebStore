package com.fh.webshopdemo.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.fh.webshopdemo.demo.model.Product;

public class ListProductRepository implements ProductRepository {

    private static final String HONEY_URL = "./Image/GoldRinge.jpg"; 
    private static final String FLIP_FLOP_URL = "./Image/GoldRinge.jpg";
    private static final String ROSE_QUARZ_URL = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.etsystatic.com%2F17828597%2Fr%2Fil%2Fd1861d%2F1710491738%2Fil_fullxfull.1710491738_c502.jpg&f=1&nofb=1&ipt=ab2f0cf26b915a394b85d20792263cde8b94006a32d799bdd7d5056ae8cb8192&ipo=images";


    private static final List<Product> products = new ArrayList<>();

    {
        products.add(new Product(1L, "Gold Ringe", "feinster Waldhonig", HONEY_URL, 4.20, 50, "Lebensmittel"));
        products.add(new Product(2L, "Flip Flops", "die trendigsten Flipper am Strand", FLIP_FLOP_URL, 19.99, 20, "Kleidung"));
        products.add(new Product(3L, "Rosenquarz", "für die Liebe", ROSE_QUARZ_URL, 8, 500, "Lebensmittel"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public List<Product> findAllByType(String type) {
        // return products.stream().filter(p -> p.getType().contains(type)).toList();

        List<Product> matches = new ArrayList<>();
        for (Product p : products) {
            if (p.getType().contains(type)) {
                matches.add(p);
            }
        }

        return matches;
    }
}
