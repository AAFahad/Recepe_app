package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Chicken Roll","200 gm chopped into cubes chicken\n" +
                "1 medium chopped tomato\n" +
                "1/2 pinch red chilli powder\n" +
                "2 tablespoon vegetable oil\n" +
                "1/2 cut into strips cucumber\n" +
                "1/2 tablespoon chopped coriander leaves\n" +
                "1 large thinly sliced onion\n" +
                "2 medium chopped green chilli\n" +
                "2 pinches garam masala powder\n" +
                "1 lemon wedges\n" +
                "1 teaspoon tomato ketchup\n" +
                "1 tablespoon green chilli sauce\n","Method",
                "Chicken Roll is a delectable North Indian recipe made using all purpose flour, stir-fried chicken, yoghurt and a variety of vegetables rolled into paranthas. On days you do not want to prepare an elaborate meal, this delectable dish can be a saviour. Rolls are quite popular across India and they are often a favourite evening snack. Egg Roll, Kathi Kebab Roll, Mutton Roll, Paneer Roll, Potato Roll and even Fish Roll are among its many variations. This easy roll recipe is made using chicken and has the unforgettable aroma of Indian spices. You can also utilize your leftover parathas and chapatis in making this recipe. If you do not like to use all-purpose flour or maida, you can make it with whole wheat flour too. In fact, it can be made even with leftover chicken. All you have to ensure is that you use the right amount of spices so that the flavour is not lost. Easy to pack and carry, you can also take it to office or prepare it for picnics and day trips. A must try roll recipe for all chicken lovers!\n",R.drawable.chicken_roll));
        recipes1.add(new Recipes("Biriyani","1 kg FAromatic rice (Chinigura/kalijeera)\n" +
                "1.5 kg Meat (Beef/mutton)\n" +
                "1/2 cup Chopped onions \n" +
                "1 tbsp each Ginger-garlic paste\n" +
                "1/2 tsp. kosher salt\n" +
                "6 tbsp. melted butter\n" +
                "2 large eggs\n" +
                "1/2 tsp. pure vanilla extract\n" +
                "Canola or vegetable oil, for frying\n","Method","\n" +
                "Firstly the Biryani spices mix is prepared by roasting and grinding 10 pcs cardamoms, 3 pcs large cinnamon sticks, ½ tsp white pepper, ½ tsp black pepper, a whole nutmeg, 2 pcs mace and 6 pcs cloves.Heat some oil in a pressure cooker, add bay leaves, cinnamon and onions and stir for a while. Add ginger-garlic pastes, chili powder and salt and stir for a while. Now add the pre-washed and properly drained meats and keep stirring to mix everything well. Add beaten yogurt and again keep stirring.No need to add water in this stage since the meats releases water. When the water dries to half, add the pre-made Biryani spices mix and 1 tbsp fried onions and keep stirring for some minutes. Now add 2 cups water, cover and wait for 8 whistles.Strain the meats out and set aside. Heat the remaining sauce from the meat in a large pot and add pre-washed and properly drained aromatic rice and keep stirring for 2-3 minutes to fry with the remaining sauce. Pour warm or boiled water, double of the amount of the rice. After a minute add milk powder, raisins, potato pieces (Pre-fried with turmeric powder and salt), black cumin, salt and sugar. Keep the flame low to medium high this time.)",R.drawable.biriyani));


        recipes1.add(new Recipes("Donut","1 c. whole milk\n" +
                "1/4 c. plus 1 tsp. granulated sugar, divided\n" +
                "1 packet (or 2 1/4 tsp.) active dry yeast \n" +
                "4 c. all-purpose flour, plus more if needed\n" +
                "1/2 tsp. kosher salt\n" +
                "6 tbsp. melted butter\n" +
                "2 large eggs\n" +
                "1/2 tsp. pure vanilla extract\n" +
                "Canola or vegetable oil, for frying\n","Method","\n" +
                "Grease a large bowl with cooking spray and set aside. In a small, microwave-safe bowl or glass measuring cup, add milk. Microwave until lukewarm, 40 seconds. Add a teaspoon of sugar and stir to dissolve, then sprinkle over yeast and let sit until frothy, about 8 minutes.\n" +
                "Make glaze: In a large bowl, whisk together milk, powdered sugar, and vanilla until smooth. Set aside.\n" +
                "Line a large baking sheet with paper towels. In a large dutch oven over medium heat, heat 2'' oil to 350°. Cook doughnuts, in batches, until deeply golden on both sides, about 1 minute per side. Holes will cook even faster!\n" +
                "Transfer doughnuts to paper towel-lined baking sheet to drain and cool slightly. Dip into glaze, then place onto a cooling rack (or eat immediately!)",R.drawable.donut1));
        recipes1.add(new Recipes("Dosa","3 cups rice\n" +
                "1 cup urad daal (split, skinless black gram)\n" +
                "3/4 teaspoon fenugreek seeds\n" +
                "Salt (to taste)\n" +
                "Vegetable / canola / sunflower cooking oil\n","Method",
                "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\n" +
                "Put some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                "When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\n" +
                "The dosa is almost done. Fold it in half and allow to cook for 30 seconds more.",R.drawable.dosa1));
        recipes1.add(new Recipes("Pancake","1 1/4 cups milk\n" +
                "1 egg\n" +
                "3 tablespoons butter melted\n" +
                "1 1/2 cups all-purpose flour\n" +
                "3 1/2 teaspoons baking powder\n" +
                "1 teaspoon salt\n" +
                "1 tablespoon white sugar\n","Method",
                "In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth." +
                "Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.",R.drawable.pancakes));
        recipes1.add(new Recipes("Pasta","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                "further saute ½ onion till they turn soft." +
                "additionally add 1 cup tomato pulp and saute well." +
                "keep stirring till the tomato pulp thickens." +
                "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                "saute till the spices gets cooked completely." +
                "now add 2 tbsp corn, ¼ capsicum, ¼ carrot, 2 tbsp peas and 7 florets broccoli. saute for a minute." +
                "add in 3 tbsp water and mix well." +
                "cover and simmer for 5 minutes." +
                "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                "add in cooked pasta and mix gently till the sauce gets coated well." +
                "finally, serve masala pasta indian style hot topped with cheese if required.",R.drawable.pasta1));

        recipes1.add(new Recipes("Ilish Polao","5 pcs Hilsa fish\n" +
                "1 tsp each Ginger-garlic paste\n" +
                "1/3 cup Chopped onion\n" +
                "8-10 pcs Green chilies" +
                "1/2 tsp Red chili powder\n" +
                "1/2 cup Sour yogurt\n" +
                "3 pcs Cinnamon\n" +
                "2 pcs Cardamom\n" +
                "1 pc Bay leaf\n" +
                "To taste Salt\n" +
                "1 tsp or to taste Sugar\n" +
                "1/2 cup Vegetable/Soybean oil\n"+
                "1/2 cup Vegetable/Soybean oil","Method",
                "Cut hilsa fish into pieces. Wash and drain properly. Use a tissue paper to soak excess water.Now heat oil in a pan. Add chopped onion and sliced green chilies. Fry for sometimes till tender. Then add ginger-garlic pastes, red chili powder, beaten sour yogurt, salt and cook for 2 to 3 minutes till oil release. Then add fish and cook with the lid.After 2 minutes carefully flip the fish over and cook for another 2 minutes. Now add some water and some fried onion. Cook fish for another 5 minutes. Then carefully take the fish out of the pan and let the spices remain. Keep the fish aside.Now add cinnamon, cardamom and bay leaf, stir for a while and add pre-washed & drained rice. Keep stirring and fry in medium-low heat for 2 to 3 minutes till the rice makes sound. Then add 6 cups of water. Add salt and sugar. Cook in medium heat with the lid. When water is dried add and hide fish pieces into the rice. Spread 1 tbsp ghee and sprinkle some crispy fried onions on the top.Now cover with the lid and keep it for 5 minutes on very low flame. After 5 minutes turn the flame off and leave it for another 5 minutes covered. Take the fish pieces out of the rice carefully and lift the rice up & down. Serve hilsa pilaf rice warm with salad.",R.drawable.ilish));


        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
