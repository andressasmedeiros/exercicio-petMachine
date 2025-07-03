public class PetMachine {

    private boolean clean = true;

    private int water = 50;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        if (this.water < 10) {
            System.out.println("Sem água suficiente para dar banho");
            return;
        }

        if (this.shampoo < 2) {
            System.out.println("Sem shampoo suficiente para dar banho");
            return;
        }

        if (pet.isClean()) {
            System.out.println("O pet " + pet.getName() + " já está limpo.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        this.clean = false;
        System.out.println("O pet " + pet.getName() + " está limpo");
        System.out.println("Shampoo restante: " + shampoo + "L");
        System.out.println("Água restante: " + water + "L");
        System.out.println("A máquina agora está suja. É necessário limpá-la antes de usar novamente.");
    }

    public void addWater() {
        if (water >= 50) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        water = Math.min(water + 10, 50);
        System.out.println("Água adicionada. Nível atual: " + water);
    }


    public void addShampoo() {
        if (shampoo >= 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        shampoo = Math.min(shampoo + 2, 10);
        System.out.println("Shampoo adicionado. Nível atual: " + shampoo);
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar pet é necessário limpa-la");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina para remover.");
            return;
        }
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi tirado da máquina");
        this.pet = null;
    }

    public void whash() {
        if (this.water < 10 || this.shampoo < 2) {
            System.out.println("Sem recursos suficientes para limpar a máquina");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa");
        System.out.println("Shampoo restante: " + shampoo + "L");
        System.out.println("Água restante: " + water + "L");
    }
}
