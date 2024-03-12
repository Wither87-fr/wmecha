// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class aa - Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "aa_- converted"), "main");
	private final ModelPart whole;

	public aa - Converted(ModelPart root) {
		this.whole = root.getChild("whole");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition whole = partdefinition.addOrReplaceChild("whole", CubeListBuilder.create(), PartPose.offset(0.0F, 22.3F, 13.4F));

		PartDefinition head = whole.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(20.9F, -195.5F, -13.4F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-17.9F, -37.8388F, -40.3299F, 34.5F, 39.6F, 80.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition body = whole.addOrReplaceChild("body", CubeListBuilder.create().texOffs(194, 200).addBox(-32.1F, 26.6F, -17.7F, 30.7F, 89.6F, 31.8F, new CubeDeformation(0.0F)), PartPose.offset(37.5F, -230.4F, -13.4F));

		PartDefinition left_cannon = whole.addOrReplaceChild("left_cannon", CubeListBuilder.create().texOffs(135, 25).addBox(-0.1F, 9.2F, -75.9F, 17.5F, 16.9F, 94.6F, new CubeDeformation(0.0F)), PartPose.offset(37.5F, -230.4F, -13.4F));

		PartDefinition right_cannon = whole.addOrReplaceChild("right_cannon", CubeListBuilder.create().texOffs(0, 120).addBox(-49.8F, 9.2F, -76.6F, 17.5F, 16.9F, 95.3F, new CubeDeformation(0.0F)), PartPose.offset(37.5F, -230.4F, -13.4F));

		PartDefinition right_leg = whole.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(6.5F, -135.1F, -2.7F));

		PartDefinition rl_subpart_1 = right_leg.addOrReplaceChild("rl_subpart_1", CubeListBuilder.create(), PartPose.offset(-6.5F, 135.1F, 2.7F));

		PartDefinition rl_top_2 = rl_subpart_1.addOrReplaceChild("rl_top_2", CubeListBuilder.create(), PartPose.offset(-2.5F, -97.6F, -25.4F));

		PartDefinition cube_r2 = rl_top_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 233).addBox(-7.8F, -1.2F, -1.1F, 17.0F, 42.1F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rl_subpart_2 = rl_subpart_1.addOrReplaceChild("rl_subpart_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rl_bottom_2 = rl_subpart_2.addOrReplaceChild("rl_bottom_2", CubeListBuilder.create(), PartPose.offset(6.5F, -135.1F, -2.7F));

		PartDefinition cube_r3 = rl_bottom_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 120).addBox(-16.9F, 61.4F, 15.8F, 17.3F, 53.1F, 16.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rl_bottom = rl_subpart_2.addOrReplaceChild("rl_bottom", CubeListBuilder.create().texOffs(119, 259).addBox(-17.5F, 109.8F, -29.5F, 18.3F, 27.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(6.5F, -135.1F, -2.7F));

		PartDefinition rl_top = right_leg.addOrReplaceChild("rl_top", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = rl_top.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(150, 0).addBox(-16.9F, -6.8F, -8.4F, 17.3F, 51.7F, 16.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition left_leg = whole.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(6.5F, -135.1F, -2.7F));

		PartDefinition ll_subpart_1 = left_leg.addOrReplaceChild("ll_subpart_1", CubeListBuilder.create(), PartPose.offset(-6.5F, 135.1F, 2.7F));

		PartDefinition ll_top_2 = ll_subpart_1.addOrReplaceChild("ll_top_2", CubeListBuilder.create(), PartPose.offset(-2.5F, -97.6F, -25.4F));

		PartDefinition cube_r5 = ll_top_2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(200, 137).addBox(38.0F, -1.2F, -1.1F, 17.0F, 42.4F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition ll_subpart_2 = ll_subpart_1.addOrReplaceChild("ll_subpart_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ll_bottom_2 = ll_subpart_2.addOrReplaceChild("ll_bottom_2", CubeListBuilder.create(), PartPose.offset(6.5F, -135.1F, -2.7F));

		PartDefinition cube_r6 = ll_bottom_2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(28.8F, 61.4F, 16.0F, 17.3F, 53.5F, 16.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition ll_bottom = ll_subpart_2.addOrReplaceChild("ll_bottom", CubeListBuilder.create().texOffs(25, 294).addBox(34.9F, -25.3F, -31.9F, 18.3F, 27.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ll_top = left_leg.addOrReplaceChild("ll_top", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = ll_top.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(131, 137).addBox(28.9F, -6.8F, -8.4F, 17.3F, 51.7F, 16.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		whole.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}